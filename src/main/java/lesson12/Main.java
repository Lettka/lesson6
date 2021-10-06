package lesson12;

import java.util.Arrays;

public class Main {

    static final int SIZE = 10_000_000;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        createArray1();
        createArray2();
    }

    public static void createArray1() {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println("method1: " + (b - a));
    }

    public static void createArray2() {
        Arrays.fill(arr, 1);
        int amountOfThreads = 10;
        long a = System.currentTimeMillis();
        Thread[] threads = new Thread[amountOfThreads];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyRunnable(SIZE / amountOfThreads));
            threads[i].start();
        }
        for (Thread t :
                threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long b = System.currentTimeMillis();
        System.out.println("method2: " + (b - a));
    }


    static class MyRunnable implements Runnable {
        private float[] a;
        private static int pos = 0;

        public MyRunnable(int size) {
            a = new float[size];
            Arrays.fill(a, 1);
        }

        @Override
        public void run() {
            for (int i = 0; i < a.length; i++) {
                a[i] = (float) (a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            synchronized (this) {
                System.arraycopy(a, 0, arr, pos, a.length);
                pos += a.length;

            }
        }
    }
}

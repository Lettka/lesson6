package lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        task1();
        System.out.println();

        System.out.println("Task2");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "123456789", "122333444", "987654321");
        System.out.println("Ivanov = " + phonebook.get("Ivanov"));
        phonebook.add("Petrov", "74382482", "47327832", "374283543");
        phonebook.add("Sidorov", "56346", "435246");
        phonebook.add("Ivanov", "8452393523", "123456789", "56346");
        System.out.println("Ivanov = " + phonebook.get("Ivanov"));
        System.out.println("Petrov = " + phonebook.get("Petrov"));
        System.out.println("Sidorov = " + phonebook.get("Sidorov"));
        System.out.println(phonebook.toString());
    }

    private static void task1() {
        List<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("dog");
        list.add("cat");
        list.add("dog");
        list.add("cat");
        list.add("dog");
        list.add("second");
        list.add("third");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s :
                list) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        System.out.println(map);
    }

    public static class Phonebook {
        private Map<String, HashSet<String>> map = new HashMap<>();

        public void add(String s, String... numbers) {
            if (map.get(s) == null) {
                map.put(s, new HashSet<>(Arrays.asList(numbers)));
            } else {
                for (int i = 0; i < numbers.length; i++) {
                    map.get(s).add(numbers[i]);
                }
            }
        }

        public HashSet<String> get(String s) {
            return map.get(s);
        }

        @Override
        public String toString() {
            return "Phonebook{" +
                    map +
                    '}';
        }
    }
}

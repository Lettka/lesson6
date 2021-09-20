package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isSatiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Bowl bowl) {
        System.out.printf("Cat %s ready to eat\n", this.name);
        if(bowl.decreaseFood(this.appetite)){
            this.isSatiety = true;
            System.out.printf("Cat %s is full.\n", this.name);
        } else {
            this.isSatiety = false;
            System.out.printf("Cat %s is hungry.\n", this.name);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = '" + name + '\'' +
                ", appetite = " + appetite +
                ", satiety = " + isSatiety +
                '}';
    }
}

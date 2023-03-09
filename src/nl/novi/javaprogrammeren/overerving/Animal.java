package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    private String name;
    private String sex;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void move() {
        System.out.println(getName() + " is 0.25 meter verplaatst");
    }

    abstract void makeNoise();

    public void sleep() {
        System.out.println(getName() + " slaapt 8 uur per dag");
    }

    public void eat(String food) {
        System.out.println(getName() + " eet " + food);
    }
}

package nl.novi.javaprogrammeren.overerving;

public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion("Scar", "Male", "Leeuwen rots", "Woensdag", "South Africa", 5);
        Tiger tiger = new Tiger("Sjaak", "Male", "Tijger land", "Zaterdag", "Indonesia", 28);
        Dog dog = new Dog("Marie", "Female", "Piet", "Royal Canin", "Labrador");
        Cat cat = new Cat("Greta", "Female", "Aafje", "Felix", true);
        Wolf wolf = new Wolf("Toto", "Male", "Wolvenbos", "Maandag", "Duitsland", "Roedel 2");

        lion.move();
        lion.makeNoise();
        lion.eat("Vlees");
        lion.sleep();
        System.out.println();

        tiger.move();
        tiger.makeNoise();
        tiger.eat("Vlees");
        tiger.sleep();
        System.out.println();

        dog.move();
        dog.makeNoise();
        dog.eat(dog.getFavoriteFoodBrand());
        dog.sleep();
        System.out.println();

        cat.move();
        cat.makeNoise();
        cat.eat(cat.getFavoriteFoodBrand());
        cat.sleep();
        System.out.println();

        wolf.move();
        wolf.makeNoise();
        wolf.eat("Vlees");
        wolf.sleep();
    }
}

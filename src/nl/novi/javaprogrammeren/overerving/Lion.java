package nl.novi.javaprogrammeren.overerving;

public class Lion extends Zoo {
    private int numberOfChildren;

    public Lion(String name, String sex, String cageName, String lastFed, String countryOfOrigin, int numberOfChildren) {
        super(name, sex, cageName, lastFed, countryOfOrigin);
        this.numberOfChildren = numberOfChildren;
    }

    public void makeNoise() {
        System.out.println("De leeuw brult");
    }
}

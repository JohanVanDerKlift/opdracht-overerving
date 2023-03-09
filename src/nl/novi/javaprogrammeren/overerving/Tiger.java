package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Zoo {
    private int numberOfStripes;

    public Tiger(String name, String sex, String cageName, String lastFed, String countryOfOrigin, int numberOfStripes) {
        super(name, sex, cageName, lastFed, countryOfOrigin);
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void makeNoise() {
        System.out.println("De tijger brult");
    }
}

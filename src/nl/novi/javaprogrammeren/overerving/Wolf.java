package nl.novi.javaprogrammeren.overerving;

public class Wolf extends Zoo {
    private String pactName;

    public Wolf(String name, String sex, String cageName, String lastFed, String countryOfOrigin, String pactName) {
        super(name, sex, cageName, lastFed, countryOfOrigin);
        this.pactName = pactName;
    }

    public void makeNoise() {
        System.out.println("De wolf huilt");
    }
}

package nl.novi.javaprogrammeren.overerving;

public abstract class Zoo extends Animal {
    private String cageName;
    private String lastFed;
    private String countryOfOrigin;

    public Zoo(String name, String sex, String cageName, String lastFed, String countryOfOrigin) {
        super(name, sex);
        this.cageName = cageName;
        this.lastFed = lastFed;
        this.countryOfOrigin = countryOfOrigin;
    }
}

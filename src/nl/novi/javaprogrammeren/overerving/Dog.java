package nl.novi.javaprogrammeren.overerving;

public class Dog extends Animal {
    private String ownerName;
    private String favoriteFoodBrand;
    private String species;

    public Dog(String name, String sex, String ownerName, String favoriteFoodBrand, String species) {
        super(name, sex);
        this.ownerName = ownerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.species = species;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void makeNoise() {
        System.out.println("De hond blaft");
    }}

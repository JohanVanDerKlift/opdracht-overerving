package nl.novi.javaprogrammeren.overerving;

public class Cat extends Animal {
    private String ownerName;
    private String favoriteFoodBrand;
    private boolean isInnerCat;

    public Cat(String name, String sex, String ownerName, String favoriteFoodBrand, boolean isInnerCat) {
        super(name, sex);
        this.ownerName = ownerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.isInnerCat = isInnerCat;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void makeNoise() {
        System.out.println("De kat miauwt");
    }
}

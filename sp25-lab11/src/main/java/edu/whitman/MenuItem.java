package edu.whitman;

public class MenuItem {

    private String name;
    private int priceInCents;
    private String category;

    public MenuItem(String name, int priceInCents, String category) {
        this.name = name;
        this.priceInCents = priceInCents;
        this.category = category;
    }

    public String getPrice() {
        return String.format("$%.2f", priceInCents / 100.0);
    }

    public String getPrice(int width) {
        String price = getPrice();

        if (width < price.length()) {
            throw new IllegalStateException("Width is too small for the price.");
        }

        return String.format("%" + width + "s", price);
    }

    public String getCategory(){
        return category;
    }

    public String getName(){
        return name;
    }

    public int getPriceInCents(){
        return priceInCents;
    }

    @Override
    public String toString() {
        return name + "," + priceInCents + "," + category;
    }

}
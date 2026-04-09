package entitiesageable;

import interfacce.Ageable;

public class Smartphone implements Ageable
{

    public Smartphone(String model, String brand, double price, int releaseYear) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    private String model,brand;
    private double price;
    private int releaseYear;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public double getAge() {
        return 2026-releaseYear;
    }
}

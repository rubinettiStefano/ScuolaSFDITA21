package entitiesageable;

import interfacce.Ageable;

public class House implements Ageable
{
    public House(String address, int price, int constructionYear) {
        this.address = address;
        this.price = price;
        this.constructionYear = constructionYear;
    }

    private String address;
    private int price;
    private int constructionYear;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }
    @Override
    public double getAge() {
        return 2026-constructionYear;
    }
}

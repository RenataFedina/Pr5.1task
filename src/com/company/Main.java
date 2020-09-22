package com.company;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate("Ceramics", 2);
        Cup cup = new Cup("glass", "red");
        Saucepan saucepan = new Saucepan("iron", 5000);
        plate.display();
        plate.displayp();
        cup.displayc();
        saucepan.displays();
    }
}

class Dish {

    private String material;
    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public Dish(String material)
    {
        this.material = material;
    }
    public void display()
    {
        System.out.println("Material " + material);
    }
    }

class Plate extends Dish {
    private int deep;

    public Plate(String material, int deep)
    {
        super(material);
        this.deep = deep;
    }

    public void displayp()
    {
        System.out.println("Material " + getMaterial() + " deep " + deep);
    }
}

class Cup extends Dish {
    private String color;

    public Cup(String material, String color)
    {
        super(material);
        this.color = color;
    }

    public void displayc()
    {
        System.out.println("Material " + getMaterial() + " color " + color);
    }
}

class Saucepan extends Dish {
    private int price;

    public Saucepan(String material, int price)
    {
        super(material);
        this.price = price;
    }

    public void displays()
    {
        System.out.println("Material " + getMaterial() + " price " + price);
    }
}


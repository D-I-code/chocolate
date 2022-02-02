package com.qa.chocolate.domain;

public class Chocolate {

    private String name;

    private String brand;

    private String type;

    private int tastines;

    private String texture;

    private int sugarContent;

    //cadbuty cadbury milk 100 chocolatey? 80
    // aero aero milk 100 chocolatey? 80
    // Chocolate a = new chocolate(cadbury cadbury milk 100 chocolatey? 80);

    //default constructor - best practice

    public Chocolate() {
        super();
    }

    //constructor with everything

    public Chocolate(String name, String brand, String type, int tastines, String texture, int sugarContent) {
        super();
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.tastines = tastines;
        this.texture = texture;
        this.sugarContent = sugarContent;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTastines() {
        return tastines;
    }

    public void setTastines(int tastines) {
        this.tastines = tastines;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }
}

package Flowers;

public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        if(name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Неизвестный цветок";
        }else {
            this.name = name;
        }
        if(flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        }else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()){
            this.country = "Россия";
        }else {
            this.country = country;
        }
        if (cost > 0) {
            this.cost = cost;
        }else{
            this.cost = 1.00;
        }
        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
        }else{
            this.lifeSpan = 3;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Неизвестный цветок";
        }else {
            this.name = name;
        }
    }

    public Flower(String name, String flowerColor, String country, double cost) {
        this(name, flowerColor, country, cost, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if(flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        }else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()){
            this.country = "Россия";
        }else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }else{
            this.cost = 1.00;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, цвет %s, %s, стоимость за штуку - %.2f, срок стояния (дней) - %d.", name, flowerColor, country, cost, lifeSpan);
    }
}

/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
package inheritanceTask1;

/**
 * IKIN HASANOV's response to Homework "Inheritance", Module 2.
 *
 *   Task:
 *
 *
 * @version 1.10
 * @Since 21-03-2021
 * @class
 * @author Ilkin Hasanov
 */
public class Roof extends Rectangle {
    private String color;
    private double materialPrice;
    private double thickness;

    public Roof() {
    }

    public Roof(String color, double materialPrice, double thickness) {
        this.color = color;
        this.materialPrice = materialPrice;
        this.thickness = thickness;
    }

    public Roof(double length, double width,
                String color, double materialPrice, double thickness) {
        super(length, width);
        this.color = color;
        this.materialPrice = materialPrice;
        this.thickness = thickness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(double materialPrice) {
        this.materialPrice = materialPrice;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getTotalPrice() {
        return getLength() * getWidth() * getMaterialPrice() * getThickness();
    }

    @Override
    public String toString() {
        return "Roof{" +
                "length: " + super.getLength() +
                ", width: " + super.getWidth() +
                ", color: " + this.getColor() +
                ", materialPrice: " + this.getMaterialPrice() +
                ", thickness: " + this.getThickness() +
                ", total price: " + this.getTotalPrice() +
                '}';
    }
}

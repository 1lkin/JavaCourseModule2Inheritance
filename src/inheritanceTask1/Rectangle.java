package inheritanceTask1; /**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

import java.util.Objects;

/**
 * IKIN HASANOV's response to Homework "Inheritance", Module 2.
 *
 *   Task:
 *      Create a child  from the class Rectangle
 *
 * @version 1.10
 * @Since 21-03-2021
 * @class Rectangle
 * @author Ilkin Hasanov
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    // 1. Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 2. Getters/Setters.
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (length >= 0) ? length : 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width >= 0) ? width : 0;
    }

    // 3. 5 methods
    public double getArea() {
        return this.getWidth() * this.getLength();
    }

    public boolean isSquare() {
        if (this.getLength() == this.getWidth()) {
            return true;
        } else { return false;}
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.getLength(),2)
                + Math.pow(this.getWidth(),2));
    }

    public double getPerimeter() {
        return (this.getLength() + this.getWidth()) * 2;
    }

    public String wideOrTall() {
        if (this.getWidth() > this.getLength()) {
            return "wide";
        } else if (this.getWidth() < this.getLength()) {
            return "tall";
        } else {
            return "square";
        }
    }

    // 4. Override toString() method.
    @Override
    public String toString() {
        return "inheritance.Rectangle\n===========================\n" +
                "||\tlength:\t\t" + this.getLength() +
                "\n||\twidth:\t\t" + this.getWidth() +
                "\n||\tpeimeter:\t" + this.getPerimeter() +
                "\n||\tarea:\t\t" + this.getArea() +
                "\n||\tdiagonal:\t" + this.getDiagonal() +
                "\n||\tsquare:\t\t" + this.isSquare() +
                "\n===========================\n";
    }
    public String toString(String name){
        return name +
                "length=" + this.getLength() +
                ", width=" + this.getWidth() +
                '}';
    }
    // 5. Override hash() and equals() methods.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getLength(), getLength()) == 0 &&
                Double.compare(rectangle.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }
}
package com.company;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;

    public GeometricObject() {
        setColor("");
        setFilled(false);
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract public double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2){
        if(o1.compareTo(o2) == 1) return o1;
        return o2;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract int compareTo(GeometricObject o);
}
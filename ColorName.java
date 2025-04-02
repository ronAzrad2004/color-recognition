package com.company;

public class ColorName {
    private final int red;
    private final int blue;
    private final int green;
    private final String name;
    public ColorName(String name,int r,int g,int b){
        this.red=r;
        this.blue=b;
        this.green=g;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int computeMSE(int pixR, int pixG, int pixB) {
        return ((pixR - red) * (pixR - red) + (pixG - green) * (pixG - green) + (pixB - blue)
                * (pixB - blue)) / 3;
    }

    @Override
    public String toString() {
        return "Color name{" +
                "red=" + red +
                ", blue=" + blue +
                ", green=" + green +
                ", name='" + name + '\'' +
                '}';
    }
}


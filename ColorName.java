package com.company;

/**
 * This class represents a color with its RGB values and a corresponding name.
 */
public class ColorName {
    // Red component of the color (0-255)
    private final int red;

    // Blue component of the color (0-255)
    private final int blue;

    // Green component of the color (0-255)
    private final int green;

    // Name of the color
    private final String name;

    /**
     * Constructor to initialize the color with its name and RGB values.
     *
     * @param name Name of the color
     * @param r    Red component (0-255)
     * @param g    Green component (0-255)
     * @param b    Blue component (0-255)
     */
    public ColorName(String name, int r, int g, int b) {
        this.red = r;
        this.blue = b;
        this.green = g;
        this.name = name;
    }

    /**
     * Gets the name of the color.
     *
     * @return The name of the color.
     */
    public String getName() {
        return name;
    }

    /**
     * Computes the Mean Squared Error (MSE) between this color and another RGB color.
     * The lower the MSE, the more similar the colors are.
     *
     * @param pixR Red component of the comparison color
     * @param pixG Green component of the comparison color
     * @param pixB Blue component of the comparison color
     * @return The computed MSE value.
     */
    public int computeMSE(int pixR, int pixG, int pixB) {
        return ((pixR - red) * (pixR - red) +
                (pixG - green) * (pixG - green) +
                (pixB - blue) * (pixB - blue)) / 3;
    }

    /**
     * Returns a string representation of the color.
     *
     * @return A formatted string containing the color's name and RGB values.
     */
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



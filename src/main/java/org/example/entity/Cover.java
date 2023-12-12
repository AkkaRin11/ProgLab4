package org.example.entity;

public class Cover extends Entity{
    private final String material;
    private final String colour;

    {
        material = "клеёнчатая";
        colour = "чёрная";
    }

    public String getSpecifications(){
        return colour + " " + material;
    }

    @Override
    public String toString() {
        return getSpecifications() + " обложка";
    }

    @Override
    public int hashCode() {
        int result = material == null ? 0 : material.hashCode();
        result = 31 * result + colour.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cover that = (Cover) o;

        if (material != that.material) return false;
        return colour == that.colour;
    }
}

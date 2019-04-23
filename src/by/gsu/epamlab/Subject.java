package by.gsu.epamlab;

public class Subject {

    private String name;
    private Materials material;
    private double volume;

    public Subject() {
    }

    public Subject(String name, Materials material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return material.getDensity() * volume;
    }

    public Materials getMaterial() {
        return material;
    }

    public void setMaterial(Materials material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return name + ';' + material + ';' + volume + ';' + getMass();
    }
}

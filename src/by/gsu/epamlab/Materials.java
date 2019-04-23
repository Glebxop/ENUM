package by.gsu.epamlab;

public enum Materials {

    STEEL(7850), COPPER(8500);

    private double density;

    Materials(int density) {
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return name() +
                ";" + density;
    }
}

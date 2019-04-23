
import by.gsu.epamlab.Materials;
import by.gsu.epamlab.Subject;

public class Runner {
    public static void main(String[] args) {


        Subject wire = new Subject("Wire", Materials.STEEL, 0.03);

        System.out.println(wire);

        wire.setMaterial(Materials.COPPER);

        System.out.printf("The wire mass is %.1f kg", wire.getMass());

    }
}

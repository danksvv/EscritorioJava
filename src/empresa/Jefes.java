package empresa;

import empleados.Empleado;

import java.util.ArrayList;

public class Jefes extends Empleados {
    private final int Id;
    private static int contador = 0;
    private ArrayList<Obreros> obreros;

    public Jefes(String nombre, int edad, double sueldo) {
        super(nombre, edad, sueldo);
        this.Id = ++contador;
    }

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Jefes{" +
                "Id= J" + getId() +
                '}' + super.toString();
    }
}

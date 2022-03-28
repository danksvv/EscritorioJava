package empleados;

public class Jefatura extends Empleado{
    private double incentivo;

    public Jefatura(String nombre, double sueldo, int dia, int mes, int anno) {
        super(nombre, sueldo, dia, mes, anno);
    }

    public void establecerIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {
        return super.getSueldo() + incentivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Jefatura{" +
                "incentivo=" + incentivo +
                '}';
    }
}

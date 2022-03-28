package empleados;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private double sueldo;
    private Date fecha_alta;

    public Empleado(String nombre, double sueldo, int dia, int mes, int anno) {
       this.nombre = nombre;
       this.sueldo = sueldo;
        GregorianCalendar fecha = new GregorianCalendar(anno, mes, dia);
        this.fecha_alta = fecha.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public void subeSueldo(double porcentaje) {
        this.sueldo += this.sueldo * porcentaje / 100;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + getSueldo() +
                ", fecha_alta=" + fecha_alta +
                '}';
    }
}

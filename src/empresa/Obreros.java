package empresa;

public class Obreros extends Empleados {
    private final int Id;
    private static int contador = 0;
    private Jefes jefe;

    public Obreros(String nombre, int edad, double sueldo){
        super(nombre, edad, sueldo);
        this.Id = ++contador;
    }

    public int getId(){
        return Id;
    }

    @Override
    public String toString() {
        return "Obreros{" +
                "Id= O" + getId() +
                '}' + super.toString();
    }
}

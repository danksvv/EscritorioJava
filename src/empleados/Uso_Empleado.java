package empleados;

import java.util.ArrayList;

public class Uso_Empleado {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        Empleado e1 = new Empleado("Jose Manuel", 20000, 1991, 12, 21);

        empleados.add(new Empleado("Ana Maria", 120000, 1998, 8, 12));
        empleados.add(e1);
        empleados.add(0, new Empleado("Jorge Sanz", 40000, 2001, 11, 30));

        for (Empleado item : empleados)
            System.out.println(item);

        System.out.println("Total de empleados => " + empleados.size());
    }
}

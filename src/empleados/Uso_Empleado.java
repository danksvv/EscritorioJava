package empleados;

import java.util.ArrayList;

public class Uso_Empleado {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Empleado e1 = new Empleado("Jose Manuel", 20000, 11, 12, 2002);
        Empleado e2 = new Jefatura("Sandra Olivares", 120000, 31, 1, 2005);
        Jefatura j1 = new Jefatura("David Ortega", 80000, 12, 4, 1995);

        Jefatura Jefa_RRHH = (Jefatura)e2;
        Jefa_RRHH.establecerIncentivo(300);

        empleados.add(new Empleado("Ana Maria", 120000, 18, 8, 1998));
        empleados.add(e1);
        empleados.add(0, new Empleado("Jorge Sanz", 40000, 21, 11, 1991));
        empleados.add(new Empleado("Silvia Andrea", 10000, 20, 8, 2012));
        empleados.add(j1);
        empleados.add(0, e2);
        j1.establecerIncentivo(500);

        System.out.println("====================================================");
        for (Empleado item : empleados)
            System.out.println(item);

        System.out.println("El array esta : " + (empleados.isEmpty() ? "esta vacio" : " esta lleno"));
        System.out.println("El array esta : " + (listaEmpleados.isEmpty() ? "esta vacio" : " esta lleno"));
        System.out.println("Total de empleados => " + empleados.size());
        System.out.println("El empleado en la posicion 3 es : " + empleados.get(2));
        System.out.println("Contiene a la Jefa de RRHH : " + (empleados.contains(e2) ? "Si" : "No"));
        System.out.println("Contiene a la Jefa de RRHH : " + (empleados.contains(j1) ? "Si" : "No"));
        System.out.println("La Jefa de RRHH se encuentra en la posicion : " + empleados.indexOf(e1));
        System.out.println("Sustitucion de elemento  : " + empleados.set(2, j1));
        System.out.println("Borramos el objeto sustituido : " + empleados.remove(2));
        System.out.println("====================================================");

        for (Empleado item : empleados)
            System.out.println(item);

        System.out.println("====================================================");



        System.out.println("====================================================");

        System.out.println("Borrado de elementos ");
        empleados.clear();

        System.out.println("Total de empleados => " + empleados.size());

    }



}

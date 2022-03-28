package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String continuar;

        ArrayList<Empleados> empleados = new ArrayList<>();

        do {
            System.out.println("****************************************************************************************");
            System.out.println("*****************************------ MENU DE OPCIONES -----******************************");
            System.out.println("****************************************************************************************");
            System.out.println("1. Añadir empleado");
            System.out.println("2. Subir sueldo");
            System.out.println("3. Listar obreros de un determinado Jefe");
            System.out.println("4. Mostrar el Jefe de un obrero");
            System.out.println("5. Lista todos los datos");
            System.out.println("6. Eliminar empleado");
            System.out.print("Introduzca una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    empleados.add(cargarDatos(empleados));
                    break;
                case 5:
                    System.out.println("****************************************************************************************");

                    for (Empleados empleado : empleados)
                        System.out.println(empleado);

                    System.out.println("****************************************************************************************");

                    break;

            }

            System.out.println("Desea continuar? (s/n)");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static Empleados cargarDatos(ArrayList<Empleados> empleados) {
        System.out.println("Introduce el tipo de empleado");
        String tipo = sc.next();
        if (tipo.equalsIgnoreCase("obreros") || tipo.equalsIgnoreCase("jefes")) {
            System.out.println("Introduce el nombre del empleado");
            sc.nextLine();  // Limpiar buffer
            String nombre = sc.nextLine();
            if (empleados.size() > 0)
                nombre = validarNombre(nombre, empleados);
            System.out.println("Introduce la edad del empleado");
            int edad = sc.nextInt();
            System.out.println("Introduce el sueldo del empleado");
            double sueldo = sc.nextDouble();
            return tipo.equalsIgnoreCase("obreros") ? new Obreros(nombre, edad, sueldo) : new Jefes(nombre, edad, sueldo);
        }
        else
            System.out.println("No se ha introducido un tipo de empleado valido");
        return null;
    }

    public static String validarNombre(String nombre, ArrayList<Empleados> empleados) {
        boolean valido = false;
        while (!valido) {
            for (Empleados empleado : empleados) {
                if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("El nombre ya existe, introduzca otro");
                    nombre = sc.nextLine();
                    valido = false;
                } else {
                    valido = true;
                }
            }
        }
        return nombre;
    }
}

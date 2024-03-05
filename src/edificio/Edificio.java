package edificio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Edificio {
    static Calendar Fecha = Calendar.getInstance();
    static Calendar Hora = Calendar.getInstance();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> listado = new ArrayList<>(); // Declarar el ArrayList fuera del método main

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Bienvenido a la recepción del edificio ");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1- Registrar entrada       2- Marcar salida       3- Modificar datos       4- Salir del programa");
            System.out.print("Digite el número de la operación: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registro();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    static void registro() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un DNI: ");
        int DNI = leer.nextInt();
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        nombre = teclado.nextLine();
        String sexo;
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Díganos su sexo de nacimiento: ");
        sexo = ingresar.nextLine();
        String Cumpleaños;
        Scanner cumple = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (dd/mm/aa): ");
        Cumpleaños = cumple.nextLine();
        System.out.println("Nombre del visitante: " + nombre);

        int min, hora, dia, mes, anno;
        String FechaActual, HoraActual;
        hora = Hora.get(Calendar.HOUR_OF_DAY);
        min = Hora.get(Calendar.MINUTE);
        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH);
        anno = Fecha.get(Calendar.YEAR);
        HoraActual = hora + ":" + min;
        FechaActual = dia + "/" + (mes + 1) + "/" + anno;

        System.out.println("La fecha del día es: " + FechaActual + " Hora del registro: " + HoraActual);

        if (listado.contains(DNI)) {
            System.out.println("El DNI ya está en el listado");
        } else {
            listado.add(DNI);
            System.out.println("El DNI fue guardado");
        }
        System.out.println("Lista: " + listado);
    }

    static void eliminar() {
        System.out.print("¿Cuál DNI desea eliminar?: ");
        int DNI = scanner.nextInt();
        if (listado.contains(DNI)) {
            listado.remove(Integer.valueOf(DNI));
            System.out.println("El DNI ha sido eliminado");
        } else {
            System.out.println("El DNI no está en el listado");
        }
        System.out.println("Lista actualizada: " + listado);
    }

    static void modificar() {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuál DNI desea modificar?: ");
        int DNI = leer.nextInt();
        if (listado.contains(DNI)) {
            System.out.println("¿Qué dato desea modificar?");
            System.out.println("N=Nombre; A=Cumpleaños; I=DNI; S=Sexo");
            String opcion = leer.next();
            switch (opcion.toUpperCase()) {
                case "N":
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = leer.next();
                    // Puedes agregar lógica para modificar el nombre en la lista
                    System.out.println("Nombre modificado correctamente");
                    break;
                case "A":
                    System.out.print("Nueva fecha de cumpleaños (dd/mm/aa): ");
                    String nuevaFecha = leer.next();
                    // Puedes agregar lógica para modificar la fecha en la lista
                    System.out.println("Fecha de cumpleaños modificada correctamente");
                    break;
                case "I":
                    System.out.print("Nuevo DNI: ");
                    int nuevoDNI = leer.nextInt();
                    // Puedes agregar lógica para modificar el DNI en la lista
                    System.out.println("DNI modificado correctamente");
                    break;
                case "S":
                    System.out.print("Nuevo sexo: ");
                    String nuevoSexo = leer.next();
                    // Puedes agregar lógica para modificar el sexo en la lista
                    System.out.println("Sexo modificado correctamente");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } else {
            System.out.println("El DNI no está en el listado");
        }
    }
}
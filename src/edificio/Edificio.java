/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edificio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
public class Edificio {
  static Calendar Fecha = Calendar.getInstance();//funcion para ingresar fecha actual
  static Calendar Hora = Calendar.getInstance();// funcion para agregar hora actual
  static Scanner scanner =new Scanner(System.in);
    
  public static void main (String[] args ){
    int opcion = 0;
    do{    //menu principal
    System.out.println("Bienvenido a la resepcion del edificio ");
    System.out.println("que desea hacer");
    System.out.println("1- registrar entrada           2- marcar salida       3-modificar datos       4-salir del progrma");
    System.out.println("digite el numero de la operacion");
    opcion=scanner.nextInt();//ingreso de funcion a realizar
        switch(opcion){
            case 1:
                registro();//funcion para ingresar datos del visitante
                break;
            case 2:
             Eliminar();  //funcion para eliminar visita
             break;
            case 3:
                Modificar();
                break;
                
        }
    }while(opcion!=3);
    }
      static void registro() {
     Scanner leer = new Scanner(System.in);
     System.out.print("Ingrese un DNI:  ");
     int DNI = leer.nextInt(); //introduccion de DNI del visitante
     ArrayList listado = new ArrayList();
     String nombre;//variable donde se almacenan los nombres del visitante
     Scanner teclado = new Scanner(System.in);
     System.out.print("Ingrese su nombre completo:  ");
      nombre = teclado.nextLine();//metodo para leer la variable
      String sexo ;
      Scanner ingresar = new Scanner(System.in);
      System.out.println("diganos su sexo de nacimiento");//ingreso de sexo
      sexo = ingresar.nextLine();
      String Cumpleaños;
      Scanner cumple = new Scanner(System.in);
      System.out.println("ingrese su fecha de nacimiento (dd/mm/aa)");//ingreso de fecha de nacimiento
      Cumpleaños = cumple.nextLine();
      System.out.println("Nombre del visitante " + nombre);
     listado.add(1010);//DNI'S ya registrados 
     listado.add(2020);
     int min, hora, dia, mes, anno;//variantes de fecha y hora local
     String FechaActual, HoraActual;//cadena de hora y fecha
     hora = Hora.get(Calendar.HOUR_OF_DAY);//llamado de hora del sistema
     min = Hora.get(Calendar.MINUTE);//llamado de minutos transcuridos
     dia = Fecha.get(Calendar.DATE);//llamado del dia actual
     mes = Fecha.get(Calendar.MONTH);//llamado del mes actual
     anno = Fecha.get(Calendar.YEAR);//llamado del año actual 
     HoraActual = hora + ":" + min;//union de la hora completa
     FechaActual = dia + "/" + (mes+1) + "/" + anno;//union de la fecha completa
        System.out.println("La fecha del dia es: "+ FechaActual +" Hora del registro: "+ HoraActual);
        
     if(listado.contains(DNI)){
        System.out.println("E DNI ya esta en el listado");//DNI registrado
     }else{
           listado.add(DNI);
           System.out.println("El DNI fue guardado");//DNI dado de alta
     }
     System.out.println("lista; "+listado);//listado de visitantes actuales 
    }
      static void Eliminar() {
     
     }
        static void Modificar() {
     
     }
}

/*
 
    public Pasajero()
    {
        // Inicialización
        identificacion = "desconocido";
        nombre = "desconocido";
        apellidos = "desconocido";
        email = "desconocido";
        celular = "desconocido";
        edad = 0;
    }

// Escribir métodos getters y setters

   
    //Metodos Modificadores//
    public void SetArrayList(Int DNI) {
        this.DNI = DNI;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public void SetApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public void SetCelular(String celular) {
        this.celular = celular;
    }

    public void SetEdad(int edad) {
        this.edad = edad;
    }

// Metodos Analizador//
    public String getIdentificacion() {

        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }

}*/
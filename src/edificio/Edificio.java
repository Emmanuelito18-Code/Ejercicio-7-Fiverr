/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edificio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
public class Edificio {
  static Calendar Fecha = Calendar.getInstance();
  static Calendar Hora = Calendar.getInstance();
  static Scanner scanner =new Scanner(System.in);
    
  public static void main (String[] args ){
    int cont = 0;
    do{    
    System.out.println("Bienvenido a la resepcion del edificio ");
    System.out.println("que desea hacer");
    System.out.println("1- registrara entrada           2- marcar salida          3-salir del progrma");
    System.out.println("digite el numero de la operacion");
    int opcion=scanner.nextInt();
        switch(opcion){
            case 1:
                registro();
                break;
            case 2:
             Eliminar();  
             break;
                
            default:
                
        }
    }while(opcion!=3);
    }
      static void registro() {
     Scanner leer = new Scanner(System.in);
     System.out.print("Ingrese un DNI:  ");
     int DNI = leer.nextInt();
     ArrayList listado = new ArrayList();
     listado.add(1010);
     listado.add(2020);
     int min, hora, dia, mes, anno;
     String FechaActual, HoraActual;
     hora = Hora.get(Calendar.HOUR_OF_DAY);
     min = Hora.get(Calendar.MINUTE);
     dia = Fecha.get(Calendar.DATE);
     mes = Fecha.get(Calendar.MONTH);
     anno = Fecha.get(Calendar.YEAR);
     HoraActual = hora + ":" + min;
     FechaActual = dia + "/" + (mes+1) + "/" + anno;
        System.out.println("La fecha del dia es: "+ FechaActual +" Hora del registro: "+ HoraActual);
        
     if(listado.contains(DNI)){
        System.out.println("E DNI ya esta en el listado");
     }else{
           listado.add(DNI);
           System.out.println("El DNI fue guardado");
     }
     System.out.println("lista; "+listado);
    }
      static void Eliminar() {
     
     }
      return main ;
}


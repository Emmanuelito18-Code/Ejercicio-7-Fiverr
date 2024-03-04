/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edificio;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Edificio {
    public static void main (String[] args ){
     Scanner leer = new Scanner(System.in);
     System.out.print("Ingrese un DNI:  ");
     int DNI = leer.nextInt();
     ArrayList listado = new ArrayList();
     listado.add(1010);
     listado.add(2020);
     if(listado.contains(DNI)){
        System.out.println("E DNI ya esta en el listado");
     }else{
           listado.add(DNI);
           System.out.println("El DNI fue guardado");
     }
     System.out.println("lista; "+listado);
    }
        
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.Scanner;





/**
 *
 * @author Usuario
 */
public class familia {
   
     Scanner entradateclado = new Scanner(System.in);
    String nombre;
    int edad;
    String parentesco;
    Float temperatura;
    ArrayList<familia> listatemperatura= new ArrayList<familia>();
    familia(){
        
        this.nombre = ingresonombre();
        this.edad = ingresoedad();
        this.parentesco = ingresoparentesco();
        this.temperatura = ingresotemperatura();
    }
    
    Float ingresotemperatura(){
       System.out.print("Ingrese la temperatura : ");
        temperatura = entradateclado.nextFloat();
        return temperatura;
    }
        String ingresoparentesco(){
        System.out.print("Ingrese el parentesco de la persona: ");
        parentesco = entradateclado.nextLine();  
        return parentesco;
    }
    int ingresoedad(){
        System.out.print("Ingrese la edad de la persona: ");
        edad = Integer.parseInt(entradateclado.nextLine());  
        return edad;
    }
    String ingresonombre(){       
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = entradateclado.nextLine();  
        return nombre;
    }
    
}


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
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner entradateclado = new Scanner(System.in);
ArrayList<familia> listapersona= new ArrayList<familia>();
int c;
 System.out.println("diguite la cantidad de personas");
 c =entradateclado.nextInt();
 for(int i=0;i<c;i++){
     listapersona.add(new familia());
  System.out.println("la persona fue añadida");
  System.out.println("tamaño de la lista despues del anterior elemento "+listapersona.size());
  
 }
 for(int h=0;h<listapersona.size();h++){
 System.out.println((h+1)+"-"+listapersona.get(h).nombre+"  su temperatura es de: "+listapersona.get(h).temperatura);
     }
  for(int m=0;m<listapersona.size();m++){
      System.out.println("datos de la persona");
 System.out.println((m+1)+"parentesco= "+listapersona.get(m).parentesco+" grados="+listapersona.get(m).temperatura+" edad="+listapersona.get(m).edad);
    }
    }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;


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
     
ArrayList<familia> listapersona= new ArrayList<familia>();
System.out.println("tamaño de la lista: "+listapersona.size());//DIEGO ES GEI

familia p1 = new familia(35,"Lucia -Mama", 35.4);
familia p2 = new familia(18,"Mario -Hijo", 36.6);
familia p3 = new familia(18,"Jesus -Padre", 37.6);
familia p4 = new familia(18,"Ana -Hija", 36.4);
familia p5 = new familia(18,"Jaime -Abuelo", 35.8);
familia p6 = new familia(18,"Maria -Abuela", 36.9);
listapersona.add(p1);
listapersona.add(p2);
listapersona.add(p3);
listapersona.add(p4);
listapersona.add(p5);
listapersona.add(p6);
p1.mostrardatos();
p2.mostrardatos();
p3.mostrardatos();
p4.mostrardatos();
p5.mostrardatos();
p6.mostrardatos();

System.out.println("***************************************************** ");
System.out.println("la temperatura de todos los mienbros de la familia es ");
System.out.println("***************************************************** ");

p1.datostemperatura();
p2.datostemperatura();
p3.datostemperatura();
p4.datostemperatura();
p5.datostemperatura();
p6.datostemperatura();


System.out.println("tamaño de la lista despues de primer elemento: "+listapersona.size());
    }
}

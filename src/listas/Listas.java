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
System.out.println("tamaño de la lista: "+listapersona.size());

familia p1 = new familia(35,"Lucia Mama", 35.4);
familia p2 = new familia(18,"Martin Hijo", 35.6);
listapersona.add(p1);
listapersona.add(p2);
p1.mostrardatos();
p2.mostrardatos();
System.out.println("la temperatura de todos los mienbros de la familia es ");
p1.datostemperatura();
p2.datostemperatura();


System.out.println("tamaño de la lista despues de primer elemento: "+listapersona.size());
    }
}

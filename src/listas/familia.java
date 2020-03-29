/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;





/**
 *
 * @author Usuario
 */
public class familia {
   
    private String nombre;
    private int edad;
    private double temperatura;
    
  
    
    
    public familia( int edad,String nombre, double temperatura){
        this.nombre=nombre;
        this.edad=edad;
       this.temperatura=temperatura;
    }
    
    
     public void mostrardatos(){
      System.out.println("el nombre y parentesco es: "+ nombre + " la edad es: "+ edad);
      
                            }
     public void datostemperatura(){
         System.out.println(" " + nombre + "  su temperatura es de: "+ temperatura);
     }
}

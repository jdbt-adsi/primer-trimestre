/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 
 * @author grasp
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar variables
      /*  int numero1=5, numero2=3,numero3=1, suma;
        String estudiante;
        Double precio;
        char genero;
        
        suma=numero1+numero2+numero3;
        
        //mostrar informcion (escribir) consola:
        System.out.println("la suma de las tres variables es: "+suma);
        
        //ventana emergente
        JOptionPane.showConfirmDialog(null,"la suma de los tres numeros es: "+ suma);
        
        //capturar el dato ingresado (leer)
        //consola: importar clase de scanner
        
        Scanner leer = new Scanner (System.in);
        System.out.println("por favor ingrese su nombre:");
        estudiante = leer.nextLine();
        System.err.println("el nombre que ingreso es: ");
        */
        
      // capturar el valor por ventana emergente
      
   /* int n1,n2;
    n1= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    n2= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    int suma= n2+n1;
    JOptionPane.showMessageDialog(null, "la suma de los numeros es: " +'\n'+ suma);*/
    
    
     
     /*solicitar el nombre del estuduante,y las tres calificaciones,mostrar
   nombre,definitiva y aviso si gana o pierde
   */
    String estudiante;
     Double n1,n2,n3,definitiva;
     estudiante = JOptionPane.showInputDialog("ingrese su nombre completo");
     n1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 1"));
     n2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 2"));
     n3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 3"));
    
     definitiva=(n1+n2+n3)/3;
     JOptionPane.showMessageDialog(null, " el estudiante " + estudiante + " tiene una nota definitiva "+ definitiva );
        if (definitiva>=3){
            JOptionPane.showMessageDialog(null, "gana");
        }
        else{
            JOptionPane.showMessageDialog(null, "pierde");
   
   
            
            
        }
     
     
      
        
        
        
    }
    
}

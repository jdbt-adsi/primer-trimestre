/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author grasp
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        // solicitar 2 numeros en variables A y B  cambiar lo de A para B y de B para A
      /*  int A,B,C;
        String d;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        A = leer.nextInt();
        B = leer.nextInt();
        C=A;        
        A=B;
        B=C;
        System.out.println("el valor de A es: "+ A +"  el valor de B " + B );*/
      
      // ingrese dos numeros y mostrar el mayor y el menor
     /* int n1,n2;
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        if(n1>n2){
        System.out.println("el  numero mayor es: " + n1);
        System.out.println("el  numero menor es: " + n2);
        }
        else{
            System.out.println("el  numero mayor es: " + n2);
            System.out.println("el  numero menor es: " + n1);*/
     
     
     //solicitar el nombre y la edad
     //mostrar el nombre y mostrar si es mayor de edad o menor de edad
     /*Scanner ten = new Scanner(System.in);
     int edad;
     String nombre;
     System.out.println("ingrese su nombre");
     nombre = ten.nextLine();
        System.out.println("ingrese se edad");
        edad = ten.nextInt();
        if(edad >=18){
        System.out.println( nombre + " usted es mayor de edad ");
        }
            else {
            System.out.println( nombre + "  usted es  menor de edad");*/
     
     
     // combustibles y precios
     Scanner ten = new Scanner(System.in);
     int gas=10000,ext=15000,dis=8000,gnv=5000,cant,total = 0;
     String combustible;
        System.out.println("ingrese tipo de combustible");
        combustible = ten.nextLine();
        System.out.println("ingrese la cantidad");
        cant = ten.nextInt();
        if("gasolina".equals(combustible)) {
            total = gas*cant;
             System.out.println("el total de la compra es: "+ total);
        }
        else{
            if("extra".equals(combustible)){
                total= ext*cant;
        
     
                    
                    }
            else{
                if("diesel".equals(combustible)){
                    total= dis*cant;
                    
                }
                else{
                  if("gas".equals(combustible)){ 
                      total= gnv*cant;
                  }
                  else{
                       System.out.println("la opcion no es valida)");
                  }
                }
            }
     
     
     
     
      System.out.println("el total de la compra es: "+ total);
            
               
                } 
        
       
       
        
           
                
        
    }
    
}

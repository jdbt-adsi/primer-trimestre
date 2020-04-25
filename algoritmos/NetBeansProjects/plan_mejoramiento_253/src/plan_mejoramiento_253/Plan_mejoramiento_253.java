/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan_mejoramiento_253;
import java.util.Scanner;
/**
 *
 * @author grasp
 */
public class Plan_mejoramiento_253 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // LLANTAS S.A.
           
      int valor_llanta=140000,cant_llantas=0,total_c = 0,desc, total=0;
        Scanner ring = new Scanner(System.in);
        System.out.println("¿CUANTAS LLANTAS  LLEVA?");
         cant_llantas = ring.nextInt();
        if(cant_llantas<5){
            total = cant_llantas*valor_llanta;
            System.out.println("no cuenta con descuento ");
            System.out.println("valor total a pagar es: "+total);
        }else{
            if(cant_llantas>=5 & cant_llantas<=10){
                valor_llanta = 125000;
                total = (cant_llantas*valor_llanta);
                 desc = (cant_llantas*15000);
                 total_c = (total-desc);
                  System.out.println("su compra es mayor a 5 unidades el valor de cada unidad es:  "+ valor_llanta);
                System.out.println("tiene un descuento total: " + desc);
                System.out.println("valor total a pagar es: "+total_c);
            }else{
                if(cant_llantas>10){
                    valor_llanta = 110000;
                    total = (cant_llantas*valor_llanta);
                    desc = (cant_llantas*30000);
                     total_c = (total-desc);
                     System.out.println("su compra es mayor a 10 unidades el valor de cada unidad es:  "+ valor_llanta);
                    System.out.println("tiene un descuento total : "+desc);
                    System.out.println("valor total a pagar es: "+total_c);
                    
                }
                  
                    }
                    
                    
                }
        
        
    
         
         // pedir numero y mosttrar los multilos de tres hasta el numero.
         
         int num,hasta,con_mult;
         num=3;
         con_mult=0;
         String resultado="";
          Scanner nm = new Scanner(System.in);
          System.out.print("ESCRIBA UN NUMERO: ");
           hasta= nm.nextInt();
           
           for (int i=1;i<=hasta;i++){
               if(i%3==0){
                 con_mult++;
                 resultado = resultado + i + "\n";
               }
           }
           System.out.println("resultado:");
            System.out.println(resultado);
            System.out.println("la cantidad de multiplos son: " + con_mult);
    }
}

     
     
        
    
    


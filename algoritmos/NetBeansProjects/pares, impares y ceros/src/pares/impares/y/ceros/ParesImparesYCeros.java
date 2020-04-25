/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares.impares.y.ceros;
import java.util.Scanner;
/**
 *
 * @author grasp
 */
public class ParesImparesYCeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 10 numeros y pares, impares y ceros.
        int num,par,inpar,suma_par,suma_inpar,con_par,con_inpar,con_cero;
     suma_par = 0;
     suma_inpar = 0;
     con_par = 0;
     con_inpar = 0;
     con_cero = 0;
     Scanner nm = new Scanner(System.in); 
     for (int i=1;i<=10;i++){
         System.out.print("ESCRIBA UN NUMERO: ");
         num = nm.nextInt();
         if(num==0){
           con_cero++;
         }else{
         if(num%2==0){
             con_par++;
             suma_par+=num;
         }else{
             con_inpar++;
             suma_inpar+=num;
             }
     }
     }
     System.out.println("LA SUMA DE LOS PARES ES: "+ suma_par);
     System.out.println("LA SUMA DE LOS INPARES ES: "+ suma_inpar);
     System.out.println("LA CANTIDAD DE NUMEROS PARES ES: "+ con_par);
     System.out.println("LA CANTIDAD DE NUMEROS IMPARES ES: "+ con_inpar);
     System.out.println("LA CANTIDAD DE CEROS ES: "+ con_cero);
} int num,suma_mult,con_mult,con_cero,n,hasta;
     suma_mult = 0;
     con_mult = 0;
     con_cero = 0;
     hasta=0;
      Scanner nm = new Scanner(System.in);
       System.out.print("ESCRIBA UN NUMERO: ");
         num = nm.nextInt();
          for (int i=1;i<hasta;i++){
           hasta =nm.nextInt();
           hasta=num;
         if(num==0){
           con_cero++;
         }else{
         if(num%3==0){
             con_mult++;
             suma_mult+=num;
         }
         }
       }
         
     System.out.println("LA SUMA DE LOS MULTIPLOS ES: "+ suma_mult);
     System.out.println("LA CANTIDAD DE NUMEROS MULTIPLO DE TRES SON: "+ con_mult);
     System.out.println("LA CANTIDAD DE CEROS ES: "+ con_cero);
     
}
   
    



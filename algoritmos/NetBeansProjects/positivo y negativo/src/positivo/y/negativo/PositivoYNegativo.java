/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivo.y.negativo;
import java.util.Scanner;
/**
 *
 * @author grasp
 */
public class PositivoYNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // positivo y negativo
       /*  int con_p = 0,con_n=0,con_c=0,n=0,suma_pos=0,suma_t;
   Scanner num = new Scanner(System.in);
   for(int i=1;i<=4;i++)
   {System.out.print("Introduce número: ");
   n = num.nextInt();
   if(n>0){
       n = con_p++;
       suma_t+= n/con_p);
 

       
   }else{
       if(n<0){
       n= con_n++;
       
   } if(n==0){
         n = con_c++; }
                 {
   }
   
    }
       
}
   System.out.println("los numeros positivos son: "+con_p);
   System.out.println("los numeros negativos son: "+con_n);
   System.out.println("la cantidad de ceros es: "+con_c);
   System.out.println("LA SUMA de los POSITIVOS son: "+suma_pos);
   
}*/
       
       //PEDIR 4 NUMEROS SUMAR PARES e IMPARES.
     int num,par,inpar,suma_par,suma_inpar,con_par,con_inpar;
     suma_par = 0;
     suma_inpar = 0;
     con_par = 0;
     con_inpar = 0;
     Scanner nm = new Scanner(System.in); 
     for (int i=1;i<=4;i++){
         System.out.print("ESCRIBA UN NUMERO: ");
         num = nm.nextInt();
         if(num%2==0){
             con_par++;
             suma_par+=num;
         }else{
             con_inpar++;
             suma_inpar+=num;
             }
     }
     System.out.println("LA SUMA DE LOS PARES ES: "+ suma_par);
     System.out.println("LA SUMA DE LOS INPARES ES: "+ suma_inpar);
     System.out.println("LA CANTIDAD DE NUMEROS PARES ES: "+ con_par);
     System.out.println("LA CANTIDAD DE NUMEROS IMPARES ES: "+ con_inpar);
}
}


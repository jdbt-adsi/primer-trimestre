/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author grasp
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arreglos
       /* int numero []={12,45,32,16,8,9,0};
        numero [4]=25;
        for (int i =0; i<=6;i++) {
            System.out.println("el valor de la array en la posicion "+  i +"es: " + numero [i]);
            
        }*/
       
      /* String [] nombres = new String[4];
       nombres[3] = "Ana";
       nombres[0] = "Juan";
       nombres[1] = "Pedro";
       for(int i = 0; i<4;i++){
           System.out.println(nombres[i]);
       }*/
     /* char [] nombres = new char [4];
      nombres [3] = 'a';
      nombres [0] = 'b';
      nombres [1] = 'c';*/
     
     
     // lenar el vector con datos de usuario
     
     
    /* Scanner leer = new Scanner(System.in);
     System.out.println("cuantos nombres va a ingresar ");
     
        int n = leer.nextInt();
     
     String name [] = new String[n];
     // mostrar el vector
     
     for(int i=0; i<n; i++){
         System.out.println("ingrese el nombre para el indice " + i + " del vector");
         name [i] = leer.nextLine();
     }
     //mostrar vector
     
             for(int i=n-1;i>=0;i--){
             System.out.println("el valor del vector en el indice "+ i + "es: "+ name[i]) ;
             }
    
    
         }*/
    
    // pedir los numeros
    // guardar solo los positivos
    
    
    Scanner num = new Scanner(System.in);
    
        System.out.println("ingrese cantidad de numeros");
        int n = num.nextInt();
        
        int numero [] = new int[n];
        int t, p=0;
        
        for(int i=0; i<n;i++){
        System.out.println("ingrse los numeros ");
        t  = num.nextInt();
        if(t>0){
        numero[p] = t;
           p=p+1;     
         t++;
        }else{
                System.out.println("esto no se guarda");
                
            }
        
        }
        
        
        
     for(int i = 0; i<p;i++){
         System.out.println("el numero se encuentra en: "+ i + "valor "+numero[i]);
     }
     
      
    }
    
}

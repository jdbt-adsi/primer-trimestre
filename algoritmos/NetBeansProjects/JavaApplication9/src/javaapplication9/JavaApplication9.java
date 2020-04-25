/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
  import java.util.Scanner;
/**
 *
 * @author grasp
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      int i,n= sc.nextInt();
      if(n==0){
      System.out.println("El numero "+n+" es Cero");
      } else{
          if(n>0){
              System.out.println("El numero "+n+" es positivo");
          }else{
          System.out.println("El numero "+n+" es negativo");
          }
      }
      i=0;
while(i==n){
n=n+i;
i=i+1;
}
System.out.println("la suma de los "+n+" numeros es "+n);

}
}
 

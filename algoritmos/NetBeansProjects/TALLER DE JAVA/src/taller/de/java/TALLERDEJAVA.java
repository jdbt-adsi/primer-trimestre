/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.de.java;
import java.util.Scanner;

/**
 *
 * @author grasp
 */
public class TALLERDEJAVA {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      /*  // solicitar 2 numeros en variables A y B  cambiar lo de A para B y de B para A
       int A,B,C;
        String d;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        A = leer.nextInt();
        B = leer.nextInt();
        C=A;        
        A=B;
        B=C;
        System.out.println("el valor de A es: "+ A +"  el valor de B " + B );*/
       
       
       
       // MAYOR,MENOR O IGUAL 
       int n1,n2;
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        if(n1==n2){
            System.out.println("los numeros son iguales");
        }
        if(n1>n2){
        System.out.println("el  numero mayor es: " + n1);
        System.out.println("el  numero menor es: " + n2);
        }
        else{
            System.out.println("el  numero mayor es: " + n2);
            System.out.println("el  numero menor es: " + n1);
        } 
      
     /* // solicitar 4 numeros y sumar los positivos,negativos y cantidad de cero.
      
 int num,cont_ceros,cont_pos,cont_neg,suma_pos,suma_neg;
 suma_neg=0;
 suma_pos=0;
 cont_neg=0;
 cont_ceros=0;
 cont_pos=0;
 Scanner nm = new Scanner(System.in); 
 for (int i=1;i<=4;i++){
 System.out.print("ESCRIBA UN NUMERO: ");
 num = nm.nextInt();
 if(num==0) {
 cont_ceros++;
 }else{
 if(num>0){
cont_pos++;
 suma_pos+=num;
 } else{  
 cont_neg++;
 suma_neg+=num;
 }} }if (cont_pos ==0)
 System.out.println("No se puede hacer la suma de los positivos");
 else
 {System.out.println("LA SUMA DE LOS POSITIVOS ES: "+ suma_pos);
 }if (cont_pos ==0)
 System.out.println("No se puede hacer la suma de los negativos");
 else{
System.out.println("LA SUMA DE LOS NEGATIVOS ES: "+ suma_neg);
}
 System.out.println("El número de positivos introducidos es de: "+cont_pos);
 System.out.println("El número de negativos introducidos es de: "+cont_neg);
 System.out.println("El número de ceros introducidos es de: "+cont_ceros);*/

    
  
}
}


           
       
       

      
       

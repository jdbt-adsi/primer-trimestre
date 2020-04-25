/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.y.descuento;
import java.util.Scanner;
/**
 *
 * @author grasp
 */
public class FRUTERIAYDESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FRUTERIA 
        int valor_kilo=12000;
        double desc=0, dtotal=0, kilo_manz=0,total=0;
        Scanner frut = new Scanner(System.in);
        System.out.println("¿CUANTOS KILOS DE MANZANAS LLEVA?");
        kilo_manz = frut.nextDouble();
        if(kilo_manz<=2){
            total = kilo_manz*valor_kilo;
            System.out.println("no cuenta con descuento ");
            System.out.println("valor a pagar es: "+total);
        }else{
            if(kilo_manz>=2.01 & kilo_manz<=5){
                desc = (kilo_manz*valor_kilo)/0.1;
                dtotal = (kilo_manz*valor_kilo)*0.1;
                System.out.println("tiene un descuento: "+dtotal);
                System.out.println("valor a pagar es: "+desc);
            }else{
                if(kilo_manz>=5.01 & kilo_manz<=10){
                    dtotal = (kilo_manz*valor_kilo)*0.15;
                    desc = (kilo_manz*valor_kilo)/0.15;
                    System.out.println("tiene un descuento: "+dtotal);
                    System.out.println("valor a pagar es: "+desc);
                    
                }else{
                    if(kilo_manz>=10.01){
                    dtotal = (kilo_manz*valor_kilo)*0.20;
                    desc = (kilo_manz*valor_kilo)/0.20;
                    System.out.println("tiene un descuento: "+dtotal);
                    System.out.println("valor a pagar es: "+desc);
                    }
                    
                    
                }
            }
        }
        
    }
    
}

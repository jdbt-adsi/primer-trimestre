/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;
import java.util.Scanner;

/**
 *
 * @author grasp
 */
public class Bebidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // BEBIDAS Y DESCUENTO.
        int bbida=3000,cant;
        double desc=0,total_desc=0;
        Scanner bbr = new Scanner(System.in);
        System.out.println("cantidad de bebidas que desea");
        cant = bbr.nextInt();
        if(cant<5){
            desc = cant*bbida;
            System.out.println("valor total a pagar es: "+desc);
            System.out.println("no tiene ningun descuento ");
        }else{
            if(cant>=5 & cant<=10){
                desc = cant*2500;
                total_desc = cant*500;
                System.out.println("se le ha realizado un descuento de: "+total_desc);
                System.out.println("VALOR TOTAL A PAGAR ES: "+desc);
                
            }else{
                if(cant>10){
                    desc = cant*2000;
                    total_desc = cant*1000;
                    System.out.println("se le ha realizado un descueto de: "+total_desc);
                    System.out.println("VALOR TOTAL A PAGAR ES: "+desc);
                    
                    
                }
            }
        }
    }
    
}

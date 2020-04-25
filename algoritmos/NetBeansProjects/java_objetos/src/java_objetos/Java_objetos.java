/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_objetos;

import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author grasp
 */
public class Java_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar los objetos
        
        objetos_java moto1,mot2;
        
        //instanciar objetos
        moto1 = new objetos_java();
        mot2 = new objetos_java("SUZUKI",550,"AZUL",17500);
        
        //declarar o instanciar
        
      objetos_java  motE = new objetos_java("YAMAHA",660,"ROJA",36500);
      moto1.setMotor(250);
      
     mot2.setMarca(JOptionPane.showInputDialog("ingrese la marca de la moto"));
    mot2.setPrecio(Double.parseDouble("ingrese el precio en dolares: "));
    
      
      // mostrar informacion
         
        System.out.println("*******MOTO1*********");
        System.out.println("la marca es: "+ moto1.getMarca());
        System.out.println("el cilindraje es: "+ moto1.getMotor());
        System.out.println("el color es: "+ moto1.getColor());
        System.out.println("su precio es de: "+ moto1.getPrecio()+ " dolares");
        System.out.println("*****************************************");
        
          System.out.println("*******MOTO2*********");
        System.out.println("la marca es: "+ mot2.getMarca());
        System.out.println("el cilindraje es: "+ mot2.getMotor());
        System.out.println("el color es: "+ mot2.getColor());
        System.out.println("su precio es de: "+ mot2.getPrecio()+ " dolares");
        System.out.println("*****************************************");
        
          System.out.println("*******MOTO E*********");
        System.out.println("la marca es: "+ motE.getMarca());
        System.out.println("el cilindraje es: "+ motE.getMotor());
        System.out.println("el color es: "+ motE.getColor());
        System.out.println("su precio es de: "+ motE.getPrecio()+ " dolares");
        System.out.println("*****************************************");
        
        
    }
    
}

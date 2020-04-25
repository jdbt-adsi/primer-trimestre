/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearclasepara.objeto;



/**
 *
 * @author COMPUTADOR 3
 */
public class CrearclaseparaObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    zapatos zapatos1,tenis2;
    
    zapatos1=new zapatos();
    tenis2=new zapatos("tennis","rojo","puma",39,180000);
   
    zapatos tacon= new zapatos();
    
        System.out.println("--------------------------------------");
        System.out.println("+++zapatos1++");
        System.out.println("tipo de zapatos es:"+zapatos1.gettipo());
        System.out.println("el color es: "+zapatos1.getcolor());
        System.out.println("la marca es: "+zapatos1.getmarca());
        System.out.println("la talla es: "+zapatos1.gettalla());
        System.out.println("el precio es; "+zapatos1.getprecio());
        System.out.println("---------------------------------------");
        
        
        System.out.println("+++tennis2++");
        System.out.println("tipo de zapatos es:"+tenis2.gettipo());
        System.out.println("cel color es: "+tenis2.getcolor());
        System.out.println("la marca es: "+tenis2.getmarca());
        System.out.println("la talla es: "+tenis2.gettalla());
        System.out.println("el precio es; "+tenis2.getprecio());
              System.out.println("-----------------------------------------");
     System.out.println("--------------------------------------");
        System.out.println("+++tacon++");
        System.out.println("tipo de zapatos es:"+tacon.gettipo());
        System.out.println("el color es: "+tacon.getcolor());
        System.out.println("la marca es: "+tacon.getmarca());
        System.out.println("la talla es: "+tacon.gettalla());
        System.out.println("el precio es; "+tacon.getprecio());
        System.out.println("---------------------------------------");
              
    }
    
}

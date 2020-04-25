/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;
import java.util.Scanner;
/**
 *
 * @author grasp
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar los objetos
        
        objetos_inmobiliaria casa1, apart2, local3;
        //declarar e instanciar.
       casa1 = new objetos_inmobiliaria("cali","valle de lili","contrulujo",990000,6,4,205.5,"casa",0,"arriendo","");
       apart2 = new objetos_inmobiliaria("medellin","laureles","construtodo",1800000,3,2,90.8,"apartamento",0,"arriendo","");
       local3 = new objetos_inmobiliaria("bogota","chapinero","storehall",3500000,4,4,202,"local",0,"arriendo","");
       
       
      //preguntar tipo de inmueble
     //preguntar tiempo de contrato
     
       Scanner  leer = new Scanner(System.in);
       System.out.println("ingrese tipo de inmueble:");
       String inmueble = leer.nextLine();
       
       casa1.pregunta_tipo_inmueble(inmueble);
       apart2.pregunta_tipo_inmueble(inmueble);
       local3.pregunta_tipo_inmueble(inmueble);
       
      System.out.println("ingrese cantidad de meses del contrato:");
         int meses =  leer.nextInt();
        casa1.pregunta_tipo_de_contrato(meses);
        apart2.pregunta_tipo_de_contrato(meses);
        local3.pregunta_tipo_de_contrato(meses);
       
      
     
     
        // mostrar informacion
        System.out.println("--------------------CASA1--------------------");
        System.out.println("la ciudad de la casa es: "+ casa1.getCiudad());
        System.out.println("el barrio de la casa es: "+ casa1.getBarrio());
        System.out.println("la constructora es: "+casa1.getMarca());
        System.out.println("el precio de la casa es: "+casa1.getPrecio());
        System.out.println("el numero de habitaciones es: "+casa1.getHabitaciones());
        System.out.println("el numero de baños es: "+casa1.getBaños());
        System.out.println("tiene un area en metros cuadrados de: "+casa1.getTamaño()+" mts²");
        System.out.println("tipo de construccion: "+casa1.getTipo_inmueble());
        System.out.println("valor de la poliza: "+casa1.getValor_poliza());
        System.out.println("tipo de contrato: "+casa1.getContrato());
        System.out.println("nota: "+casa1.getNota());
        System.out.println("--------------------------------------------");
          
        System.out.println("--------------------apartamento2--------------------");
        System.out.println("la ciudad del apartamento es: "+ apart2.getCiudad());
        System.out.println("el barrio del apartamento es: "+ apart2.getBarrio());
        System.out.println("la constructora es: "+apart2.getMarca());
        System.out.println("el precio del apartamento  es: "+apart2.getPrecio());
        System.out.println("el numero de habitaciones es: "+apart2.getHabitaciones());
        System.out.println("el numero de baños es: "+apart2.getBaños());
        System.out.println("tiene un area en metros cuadrados de: "+apart2.getTamaño()+" mts²");
        System.out.println("tipo de construccion: "+apart2.getTipo_inmueble());
        System.out.println("valor de la poliza: "+apart2.getValor_poliza());
        System.out.println("tipo de contrato: "+apart2.getContrato());
        System.out.println("nota: "+apart2.getNota());
        System.out.println("--------------------------------------------");
        
        System.out.println("--------------------local3--------------------");
        System.out.println("la ciudad del local es: "+ local3.getCiudad());
        System.out.println("el barrio del local es: "+ local3.getBarrio());
        System.out.println("la constructora es: "+local3.getMarca());
        System.out.println("el precio del local  es: "+local3.getPrecio());
        System.out.println("el numero de habitaciones es: "+local3.getHabitaciones());
        System.out.println("el numero de baños es: "+local3.getBaños());
        System.out.println("tiene un area en metros cuadrados de: "+local3.getTamaño()+" mts²");
        System.out.println("tipo de construccion: "+local3.getTipo_inmueble());
        System.out.println("valor de la poliza: "+local3.getValor_poliza());
        System.out.println("tipo de contrato: "+local3.getContrato());
        System.out.println("nota: "+local3.getNota());
        System.out.println("--------------------------------------------");
          
    }
    
}

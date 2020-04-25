/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author grasp
 */
public class objetos_inmobiliaria {
    //atributos
    private String ciudad;
    private String  barrio;
    private String marca;
    private double precio;
    private int habitaciones;
    private int baños;
    private double tamaño;  
    private String tipo_inmueble;
    private double valor_poliza;
    private String contrato;
    private String nota;
    
    
    // constructores.
public objetos_inmobiliaria(){
    
}

    public objetos_inmobiliaria(String ciudad, String barrio, String marca, double precio, int habitaciones, int baños, double tamaño, String tipo_inmueble, double valor_poliza, String contrato, String nota) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.marca = marca;
        this.precio = precio;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.tamaño = tamaño;
        this.tipo_inmueble = tipo_inmueble;
        this.valor_poliza = valor_poliza;
        this.contrato = contrato;
        this.nota = nota;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo_inmueble() {
        return tipo_inmueble;
    }

    public void setTipo_inmueble(String tipo_inmueble) {
        this.tipo_inmueble = tipo_inmueble;
    }

    public double getValor_poliza() {
        return valor_poliza;
    }

    public void setValor_poliza(double valor_poliza) {
        this.valor_poliza = valor_poliza;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
   public boolean  pregunta_tipo_inmueble(String inmueble){
       boolean respuesta = false;
       if("casa".equals(tipo_inmueble)) {
           valor_poliza= 500000;
           respuesta=true;
     
    }else{
           if("apartamento".equals(tipo_inmueble)){
               valor_poliza= 200000;
           }else{
               valor_poliza=900000;
           }
           respuesta = true;
       }
       return respuesta;
}
   public boolean pregunta_tipo_de_contrato(int meses){
        boolean respuesta = false;
        if(meses>6){
            nota = "deposito de un millon";
        }else{
            nota ="deposito de doscientos mil pesos";
            respuesta = true;
        }
        return respuesta;
        
   }
   
   }

   
    


   


  

  
    
       
   


    




  


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocicleta;

/**
 *
 * @author grasp
 */
public class Motocicleta {
        // motocicleta
        
        
        
 
private String modelo;
private String marca;
private String color;
private int precio;
private int annio;
        
//constructores
  public Motocicleta(){
        this.modelo="GS-550";
        this.marca="SUZUKI";
        this.color="azul";
        this.precio=17500000;
        this.annio=2020;
}
  public Motocicleta(String modelo,String color,int precio,int annio) {
    this.marca =marca;
    this.modelo=modelo;
    this.precio=precio;
    this.color=color;
    this.annio=annio;
    
}
//motodos
    //get:
    public String getmarca(){
      return marca;
  }
    public String getcolor(){
      return color;
}
    public String getmodelo(){
      return modelo;
    }
    public int getannio(){
      return annio;}    
      public int getprecio(){
      return precio;}
      
      //set:
      
      public void setprecio(int precio){
          this.precio=precio;
      }
       public void setcolor(String color){
          this.color=color;
      } 
        public void setmarca(String marca){
          this.marca=marca;
      } 
         public void setmodelo(String modelo){
          this.modelo=modelo;
      } 
         public void setannio(int annio){
          this.annio=annio;
    }
    
}

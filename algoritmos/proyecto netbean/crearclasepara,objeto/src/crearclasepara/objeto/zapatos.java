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
public class zapatos {
//atributos
private String tipo;
private String marca;
private String color;
private int precio;
private int talla;
        
//constructores
  public zapatos(){
    this.tipo="tennis";
        this.marca="nike";
        this.color="rojo";
        this.precio=250000;
        this.talla=38;
}
  public zapatos(String tipo,String color,String marca,int talla,int precio) {
    this.marca=marca;
    this.tipo=tipo;
    this.precio=precio;
    this.color=color;
   this.talla=talla;
    
}
//motodos
    //get:
    public String getmarca(){
      return marca;
  }
    public String getcolor(){
      return color;
}
    public String gettipo(){
      return tipo;
    }
    
    public int getprecio(){
      return precio;
    }
    public int gettalla(){
      return talla;}    
      
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
         public void settipo(String tipo){
          this.tipo=tipo;
      } 
         public void settalla(int talla){
          this.talla=talla;}}
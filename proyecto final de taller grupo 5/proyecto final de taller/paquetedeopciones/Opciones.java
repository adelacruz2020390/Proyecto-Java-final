package paquetedeopciones;

public class Opciones{ 
     
    private int opciones; 
    private int opcion;
  	private boolean salir=false;

 public Opciones(){

 }
 public Opciones(int opciones, int opcion){
 	this.opciones = opciones;
 	this.opcion = opcion;
 	this.salir = salir=false;
 }
 public int getOpciones(){
     return opciones;
 }
 public void setOpciones(int opciones){
     this.opciones = opciones;
 }
 public int getOpcion(){
 	return opcion;
 }
 public void setOpcion(int opcion){
 	 this.opcion = opcion;
 }


 public void setSalir(boolean salir){
    this.salir = salir;
 }


}

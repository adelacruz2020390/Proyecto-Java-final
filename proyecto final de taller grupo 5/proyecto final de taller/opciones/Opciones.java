package opciones;

public class Opciones{ 
     
    private int opciones; 
    private int opcion;
 	private int opcion1;
 	private int opcion2;
 	private int opcion3;
 	private int opcion4;
 	private int opcion5;
 	private int opcion6;
 	private int borrador;
 	private boolean salir;

 public Opciones(){

 }
 public Opciones(int opciones, int opcion,int opcion1,int opcion2,int opcion3,int opcion4,int opcion5,int borrador,boolean salir, int opcion6){
 	this.opciones = opciones;
 	this.opcion = opcion;
 	this.opcion1 = opcion1;
 	this.opcion2 = opcion2;
 	this.opcion3 = opcion3;
 	this.opcion4 = opcion4;
 	this.opcion5 = opcion5:
 	this.opcion6 = opcion6;
 	this.borrador = borrador;
 	this.salir = salir;
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
 public int getOpcion1(){
 	return opcion1;
 }
 public void setOpcion1(int opcion1){
 	this.opcion1 = opcion1;
 }
 public int getOpcion2(){
 	return opcion2;
 }
 public void setOpcion2(int opcion2){
 	this.opcion2 = opcion2;
 }
 public int getOpcion3(){
	return opcion3;
 }
 public void setOpcion3(int opcion3){
 	this.opcion3 = opcion3;
 }
 public int getOpcion4(){
 	return opcion4;
 }
 public void setOpcion4(int opcion4){
 	this.opcion4 = opcion4;
 }
 public boolean getSalir(){
 	return salir;
 }
 public void setSalir(boolean salir){
    this.salir = salir;
 }
 public int getBorrador(){
 	return borrador
 }
 public void setBorrador(int borrador){
 	this.borrador = borrador;
 }
 public int getOpcion6(){
return opcion6;
 }

 public void setOpcion6(int opcion6){
 	this.opcion6=opcion6
 }


}

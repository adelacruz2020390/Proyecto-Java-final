package usuario1;

public class Persona{
	
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;

	 public Persona(){

	 }
	 public Persona(String nombre, String apellido, int identi, String genero){
     this.nombre = nombre;
     this.apellido = apellido;
     this.edad = edad;
     this.genero = genero ;
	 }
	 public String getNombre(){
	 	return nombre;
	 }
	 public void setNombre(String nombre){
     this.nombre = nombre;
	 }
	 public String getApellido(){
	 	return apellido;
	 }
	 public void setApellido(String apellido){
	 	this.apellido = apellido;
	 }
	 public int getEdad(){
	 	return edad;
	 }
	 public void setEdad(int edad){
   		this.edad = edad;
	 }
	 public String getGenero(){
	 	return genero;
	 }
	 public void setGenero(String genero){
	 	this.genero = genero;
	 }
	 public String toString(){
	 	return "(nombre "+ nombre + ",apellido "+ apellido + ",edad "+ edad + ",genero"+ genero +")";
	 }

	





}

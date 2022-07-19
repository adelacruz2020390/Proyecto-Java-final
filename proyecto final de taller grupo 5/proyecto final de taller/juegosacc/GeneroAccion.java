
package juegosacc;
public class GeneroAccion{
	private String juego1="0.Fornite";
	private String juego2="1.call of duty";
	private String juego3="2.free fire";
	private String juegoex="";
	public GeneroAccion(){

	}
	public GeneroAccion(String juego1,String juego2,String juego3,String juegoex){
		this.juego1 = juego1;
		this.juego2 = juego2;
		this.juego3 = juego3;
		this.juegoex = juegoex;
	}
	public String getJuego1(){
		return juego1;
	}
	public String getJuego2(){
		return juego2;
	}
	public String getJuego3(){
		return juego3;
	}
	public void setJuego1(String juego1){
		this.juego1 = juego1;
	}
	public void setJuego2(String juego1){
		this.juego2 = juego2;
	}
	public void setJuego3(String juego1){
		this.juego3 = juego3;
	}
	public String getJuegoex(){
		return juegoex;
	}
	public void setJuegoex(){
		this.juegoex = juegoex;
	}
	
}
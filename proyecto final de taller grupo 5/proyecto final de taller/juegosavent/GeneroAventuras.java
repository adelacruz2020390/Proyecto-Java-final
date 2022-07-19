
package juegosavent;
public class GeneroAventuras{
	private String juego4="1.Mario Bros";
	private String juego5="2.zelda";
	private String juego6= "3. Tom Breider";
	public GeneroAventuras(){
     
	}
	public GeneroAventuras(String juego4,String juego5,String juego6){
		this.juego4 = juego4;
		this.juego5 = juego5;
		this.juego6 = juego6;
	}
    public String getJuego4(){
    	return juego4;
    }
    public String getJuego5(){
    	return juego5;
    }
    public String getJuego6(){
    	return juego6;
    }
    public void setJuego4(String juego1){
    	this.juego4 = juego4;
    }
    public void setJuego5(String juego2){
    	this.juego5 = juego5;
    }
    public void setJuego6(String juego3){
    	this.juego6 = juego6;
    }

}

package juegosdepor;
public class GeneroDeportes{
	private String juego7="fifa 18";
	private String juego8="NNBA2K15";
	private String juego9="NHL12";
	
    public GeneroDeportes(){
     
	}
	
    public GeneroDeportes(String juego7,String juego8,String juego9){
		this.juego7 = juego7;
		this.juego8 = juego8;
		this.juego9 = juego9;
	}

    public String getJuego7(){
    	return juego7;
    }
    public String getJuego8(){
    	return juego8;
    }
    public String getJuego9(){
    	return juego9;
    }
    public void setJuego7(String juego7){
    	this.juego7 = juego7;
    }
    public void setJuego8(String juego8){
    	this.juego8 = juego8;
    }
    public void setJuego9(String juego9){
    	this.juego9 = juego9;
    }

}
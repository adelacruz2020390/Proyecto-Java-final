package miedo;
public class GeneroTerror{
	

    private String juego10="essledemar";
	private String juego11="grany";
	private String juego12="residentl evil";
	
    public GeneroTerror(){
     
	}
	
    public GeneroTerror(String juego10,String juego11,String juego12){
		this.juego10 = juego10;
		this.juego11 = juego11;
		this.juego12 = juego12;
	}

    public String getJuego10(){
    	return juego10;
    }
    public String getJuego11(){
    	return juego11;
    }
    public String getJuego12(){
    	return juego12;
    }
    public void setJuego10(String juego10){
    	this.juego10 = juego10;
    }
    public void setJuego11(String juego11){
    	this.juego11 = juego11;
    }
    public void setJuego12(String juego12){
    	this.juego12 = juego12;
    }

}

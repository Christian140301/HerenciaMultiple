package Clases;


/**
 * @author Usuario
 * @version 1.0
 * @created 31-oct.-2024 01:45:10
 */
public class Auto {

	private String patente;
	private String modelo;
	private double combustible = 50;
        
	/**
	 * 
	 * @param patente
	 * @param modelo
	 */
	public Auto(String patente, String modelo){
            this.patente = patente;
            this.modelo = modelo;
	}
        
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCombustible() {
        return combustible;
    }
        
        
}//end Auto
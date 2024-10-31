package Clases;


/**
 * @author Usuario
 * @version 1.0
 * @created 31-oct.-2024 01:45:13
 */
public class Casa {

	private String zona;

	/**
	 * 
	 * @param zona
	 */
        
        public Casa(){}
        
    public void construirCasa(String zona){
        this.zona = zona;
    }
        
    public String getZona() {
        return zona;
    }
    
    
}//end Casa
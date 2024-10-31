package Clases;
import Clases.Auto;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * @author Usuario
 * @version 1.0
 * @created 31-oct.-2024 01:45:21
 */
public class Padre {

	private String nombre;
	protected String apellido;
	protected Casa casa;
	protected Auto auto;

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param auto
	 */
	public Padre(String nombre, String apellido, Auto auto){
            this.nombre = nombre;
            this.apellido = apellido;
            this.casa = new Casa();
            casa.construirCasa("Centro. (2) pisos");
            comprarAuto(auto);
	}

        public Padre(String apellido, Auto auto){
            this.apellido = apellido;
            this.casa = new Casa();
            casa.construirCasa("Centro. (2) pisos");
            comprarAuto(auto);
        }
        
	/**
	 * 
	 * @param auto
	 */
	public void comprarAuto(Auto auto){
            this.auto = auto;
	}

	protected String cantar(){
            return "Asi canta tu padre, Don " + getApellido();
	}

        public void mostrarCasa(){
            System.out.println("Papá me dejo esta casa en zona " + getCasa().getZona());
        }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Casa getCasa() {
        return casa;
    }

    public Auto getAuto() {
        return auto;
    }
        
        
}//end Padre
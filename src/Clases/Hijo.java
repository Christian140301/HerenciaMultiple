package Clases;


/**
 * @author Usuario
 * @version 1.0
 * @created 31-oct.-2024 01:45:18
 */
public class Hijo extends Padre implements Madre, Tio, Hermano {

	private String nombre;
	private double billetera;
	private Celular telefono;

	/**
	 * 
	 * @param nombre
	 * @param telefono
	 * @param auto
	 * @param apellido
	 * @param casa
	 * @param billetera
	 */
	public Hijo(String nombre, Celular telefono, Auto auto, String apellido, double billetera){
            super(apellido, auto);
            this.nombre = nombre;
            this.billetera = billetera;
            this.telefono = telefono;
	}

    public void setBilletera(double billetera) {
        this.billetera = billetera;
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

    public String getNombre() {
        return nombre;
    }

    public double getBilletera() {
        return billetera;
    }

    public Celular getTelefono() {
        return telefono;
    }

        
        public void mostrarAuto(Auto auto){
            System.out.println("Papá me dejó este auto: " + getAuto().getModelo());
        }
    
	public void conducirAuto(Auto auto){
            System.out.println("Conduciendo un " + auto.getModelo() + " de un amigo!");
	}
        
        @Override
        public String cantar(){
            return super.cantar() + " y asi canta Juan Carlos";
        }

	public int jugarLoteria(){
                setBilletera(FORTUNA);
		return NROSUERTE;
	}

        @Override
	public void bailar(){
            System.out.println("Se bailar como mi madre ♪ ♫ ♪");
	}

	/**
	 * 
	 * @param money
	 */
	public void heredarDinero(double money){
            double dinero = getBilletera() + money;
            setBilletera(dinero);
            System.out.println("MSJ de tio " + NOMBRE + ": disfruta la herencia Addams, sumas " + getBilletera() + " dolaritos");
	}
        
        @Override
	public void jugarFutbol(){
            System.out.println("Se jugar futbol gracias a mi hermano");
	}
        
        public int hacerGoles(){
            return 0;
	}
}//end Hijo
import Clases.Auto;
import Clases.Celular;
import Clases.Hijo;
import Clases.Padre;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto cascajo = new Auto("123LATA", "Renault 12");
        
        Auto auto_amigo = new Auto("999POWR", "Ford Focus");
        
        Celular cel = new Celular("Claro", 381855, 5000);
        
        Padre padre = new Padre("Papá", "López", new Auto("AE678QZ", "Ford Focus"));
        
        Hijo hijo = new Hijo("Juan Carlos", cel, cascajo, padre.getApellido(), 0);      
        
         
        padre.mostrarCasa();       
        System.out.println("Soy el hijo Juan Carlos herede de mi padre su apellido: " + hijo.getApellido());
        hijo.mostrarAuto(cascajo);
        hijo.conducirAuto(auto_amigo);
        hijo.jugarFutbol();
        hijo.bailar();
        System.out.println("SALIO EL NUMERO DE LA SUERTE " + hijo.jugarLoteria());
        System.out.println("Heredaste la Fortuna de 50000 de tu madre la ROSA!! Ahora tienes " + hijo.getBilletera() + " !!!");
        System.out.println(hijo.cantar());
        hijo.heredarDinero(2000);
        System.out.println("Jugando al futbol, Hoy has hecho " + hijo.hacerGoles() + " goles");
    }
    
}

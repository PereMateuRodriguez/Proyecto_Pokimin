import Mascotas.MascotasPrincipal;
import Mascotas.*;
import Personas.Personaje;

import javax.annotation.processing.ProcessingEnvironment;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciamos el Personaje Principal
        Personaje principal = new Personaje(100, 5, 10, 2,1);
        Volador volta = new Volador("Volta", 50, 5, 5, 10, 1);
        Terrestre terre = new Terrestre("Terre", 150, 50, 3, 1, 5);
        Acuatico acua = new Acuatico("Acua", 1000, 100, 200, 100, 100);
        while (true) {
            //Nivel en el que se encuentra nuestro Personaje
            int LVL = 0;
            //Elecion del lo que quiere hacer
            String Elecion;
            while (true) {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("""
                    ----------------------------------
                               Que quieres hacer?
                                
                    a) Matar    b) Buscar un Animal Fantastico     c) Mirar estadistica    d) Entrenar      
                            
                            """);

                Elecion = myObj.nextLine();  // Read user input

                Elecion = Elecion.toLowerCase();
                //Mirar si el dato de entrada tiene sentido sino repite la ejecucion
                if (Elecion.equals("a") || Elecion.equals("b") || Elecion.equals("c") || Elecion.equals("d")) {
                    break;
                } else {
                    System.err.println("Error: No has elegido una opcion valida\n");

                }
            }
            //-----------------Matar----------------------------------
            if (Elecion.equals("a")) {
                System.out.println("A");
            }
            //----------------Animal Fantastico--------------------------------
            else if (Elecion.equals("b")) {
                //LVL < 10
                if(principal.getLvL() < 10){
                    if (QuienHaMuerto(principal, volta) == true){
                        principal.SonidoGanar();
                        // Elegir si quiere capturarlo
                        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                        System.out.println("Quieres Capturar a la Volat? \n a) SI \nCualquier otro valor) No");

                        Elecion = myObj.nextLine();  // Read user input

                        Elecion = Elecion.toLowerCase();
                        if (Elecion.equals("a")){
                            //Aqui lo convertiremos en un SET asi no se puede repetir la mascota
                            principal.añadirMascotas(volta);
                        }
                    }
                    else{
                        principal.SonidoPerder();
                    }
                }
                // LVL < 25
                else if (principal.getLvL() < 25){
                    if (QuienHaMuerto(principal, terre) == true){
                        principal.SonidoGanar();
                        // Elegir si quiere capturarlo
                        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                        System.out.println("Quieres Capturar a la terre? \n a) SI \nCualquier otro valor) No");

                        Elecion = myObj.nextLine();  // Read user input

                        Elecion = Elecion.toLowerCase();
                        if (Elecion.equals("a")){
                            //Aqui lo convertiremos en un SET asi no se puede repetir la mascota
                            principal.añadirMascotas(terre);
                        }
                    }
                    else{
                        principal.SonidoPerder();
                    }
                }
                //LVL >= 25
                else{
                    if (QuienHaMuerto(principal, terre) == true){
                        principal.SonidoGanar();
                        // Elegir si quiere capturarlo
                        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                        System.out.println("Quieres Capturar a la terre? \n a) SI \nCualquier otro valor) No");

                        Elecion = myObj.nextLine();  // Read user input

                        Elecion = Elecion.toLowerCase();
                        if (Elecion.equals("a")){
                            //Aqui lo convertiremos en un SET asi no se puede repetir la mascota
                            principal.añadirMascotas(terre);
                        }
                    }
                    else{
                        principal.SonidoPerder();
                    }
                }


            }
            //---------------Mirar Estadisticcas y mascotas -----------------------
            else if (Elecion.equals("c")) {
                principal.VerEstadisticas();
                System.out.println(principal.getTieneMascota());
                System.out.println(principal.getMascotas());
            }
            //-------------- Entrenar --------------------------
            else {

                System.out.println("Entrenado...");
                //TiempoEspera();
                //TiempoEspera();
                principal.setDaño(principal.getDaño() + 5);
                principal.setVida(principal.getVida() + 10);
                principal.setEstamina(principal.getEstamina() + 1);
                principal.setVelocidad(principal.getVelocidad() + 1);
                principal.setLvL(principal.getLvL() + 1);
                if (principal.getTieneMascota() == true){
                    volta.setDañoMascota(volta.getDañoMascota() + 5);
                    volta.setVidaMascota(volta.getVidaMascota() +10);

                }

            }
    }
 }
 //Batalla con Una Mascota
    public static boolean QuienHaMuerto(Personaje Principal, MascotasPrincipal Volta){
        for(int i = Principal.getEstamina(); i > 0 ; i--){
            //DA Primero el Golpe el Animal
            if(Principal.getVelocidad() < Volta.getVelocidadMascota()){
                //Prinmer golpe
                TiempoEspera();
                Volta.SonidoMascota();
                Principal.setVida(Principal.getVida() - Volta.getDañoMascota());
                if(Principal.getVida() <= 0){
                    Principal.SonidoPerder();
                    return false;
                }
                //Segundo Golpe
                TiempoEspera();
                Principal.SonidoDar();
                Volta.setVidaMascota(Volta.getVidaMascota() - Principal.getDaño());
                if (Volta.getVidaMascota() <= 0){
                    Volta.SonidoMascota();
                    return true;
                }
            }
            //DA Primer Golpe Personaje
            else {
                //Primer Golpe
                TiempoEspera();
                Volta.setVidaMascota(Volta.getVidaMascota() - Principal.getDaño());
                Principal.SonidoDar();
                if (Volta.getVidaMascota() <= 0){
                    Volta.SonidoMascota();
                    return true;
                }
                //Segundo golpe
                TiempoEspera();
                Principal.setVida(Principal.getVida() - Volta.getDañoMascota());
                if(Principal.getVida() <= 0){
                    Principal.SonidoPerder();
                    return false;
                }


            }
        }
        return false;
    }

    //Tiempo de espera
    public static void TiempoEspera(){
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}



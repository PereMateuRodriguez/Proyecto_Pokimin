import Mascotas.MascotasPrincipal;
import Mascotas.Volador;
import Personas.Personaje;

import javax.annotation.processing.ProcessingEnvironment;
import java.security.Principal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciamos el Personaje Principal
        Personaje principal = new Personaje(100, 5, 10, 2,1);
        Volador volta = new Volador("Volta", 50, 5, 5, 10, 1);
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
                                
                    a) Matar    b) Buscar un Animal Fantastico     c) Mirar estadistica    d) Capturar una Mascota      
                            
                            """);

                Elecion = myObj.nextLine();  // Read user input

                Elecion = Elecion.toLowerCase();
                //Mirar si el dato de entrada tiene sentido sino repite la ejecucion
                if (Elecion.equals("a") || Elecion.equals("b") || Elecion.equals("c") || Elecion.equals("d")) {
                    break;
                } else {
                    System.out.println("Tu eres imbecil solo habia 3 opciones, vuelve a elegir!");

                }
            }
            //-----------------Matar----------------------------------
            if (Elecion.equals("a")) {
                System.out.println("A");
            }
            //----------------Animal Fantastico--------------------------------
            else if (Elecion.equals("b")) {
                //----------------------------------------------------------No puedo Meter objetos dentro de metodos

            }
            //---------------Mirar Estadisticcas-----------------------
            else if (Elecion.equals("c")) {
                System.out.println("C");
            }
            //-------------- Salir del Juego--------------------------
            else {
                System.out.println("Saliendo del Juego...");
                break;

            }
    }
 }
    public static boolean QuienHaMuerto(Personaje Principal, Volador Volta){
        for(int i = Principal.getEstamina(); i > 0 ; i--){
            //DA Primero el Golpe el Animal
            if(Principal.getVelocidad() < Volta.getVelocidadMascota()){
                //Prinmer golpe
                Volta.SonidoMascota();
                Principal.setVida(Principal.getVida() - Volta.getDañoMascota());
                if(Principal.getVida() <= 0){
                    Principal.SonidoPerder();
                    return false;
                }
                //Segundo Golpe
                Principal.SonidoDar();
                Volta.setVidaMascota(Volta.getVidaMascota() - Principal.getDaño());
                if (Volta.getVidaMascota() < 0){
                    Volta.SonidoMascota();
                    return true;
                }
            }
            //DA Primer Golpe Personaje
            else {
                //Primer Golpe

                Volta.setVidaMascota(Volta.getVidaMascota() - Principal.getDaño());
                Principal.SonidoDar();
                if (Volta.getVidaMascota() < 0){
                    Volta.SonidoMascota();
                    return true;
                }
                //Segundo golpe
                Principal.setVida(Principal.getVida() - Volta.getDañoMascota());
                if(Principal.getVida() <= 0){
                    Principal.SonidoPerder();
                    return false;
                }


            }
        }
        return false;
    }
}



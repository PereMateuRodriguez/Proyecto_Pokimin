import Mascotas.MascotasPrincipal;
import Mascotas.*;
import Materiales.PiedraVolador;
import Materiales.PiedrasMagicas;
import Personas.Malvados;
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
        //instanciamos las mascotas
        Volador volta = new Volador("Volta", 50, 5, 5, 10, 1, "Ataque Rapido" , "Ala de Acero", false);
        Terrestre terre = new Terrestre("Terre", 150, 50, 3, 1, 5, "Ataque Latigo", "Raizes Duras");
        Acuatico acua = new Acuatico("Acua", 1000, 100, 200, 100, 100, "Chorro Presion", "Cascada de HydroMuertos");
        //Instanciamos al enemigo
        Malvados enemigo = new Malvados(1500, 5, 15 );
        //Instacioamos Pidras
        PiedraVolador PiedraVolta = new PiedraVolador(1);
        while (true) {
            //Nivel en el que se encuentra nuestro Personaje
            int LVL = 0;
            //Elecion del lo que quiere hacer
            String Elecion;
            while (true) {
                Scanner myObj = new Scanner(System.in);  // Creamos esl objeto escaner
                System.out.println("""
                    ----------------------------------
                               Que quieres hacer?
                                
                    a) Matar        b) Buscar un Animal Fantastico    c) Mirar estadistica      d) Entrenar     e) Salir del Juego      
                            
                            """);

                Elecion = myObj.nextLine();

                Elecion = Elecion.toLowerCase();
                //Mirar si el dato de entrada tiene sentido sino repite la ejecucion
                if (Elecion.equals("a") || Elecion.equals("b") || Elecion.equals("c") || Elecion.equals("d")|| Elecion.equals("e")) {
                    break;
                } else {
                    System.err.println("Error: No has elegido una opcion valida\n");

                }
            }
            //-----------------Matar----------------------------------
            if (Elecion.equals("a")) {
                //------------------Mejorar Sistema de elecion de dar elecion de Mascota
                //Tiene Mascota
                if(principal.getTieneMascota()== true){
                    //Tiene una Mascota
                    if(principal.getMascotas().size() == 1){
                        if(volta.setTienePiedras()){
                            PiedraVolta.Curar(volta);
                            PiedraVolta.Pegar(volta);
                        }
                        System.out.println(MatarEnemigo(enemigo,volta));
                    }
                    //Tiene 2 Mascotas
                    else if (principal.getMascotas().size() == 2 ){
                        //Volta tiene mas LvL
                        if (volta.getLvLMascota() > terre.getLvLMascota()){
                            //Miramos que tenga una piedra
                            if(volta.setTienePiedras()){
                                //Utilizamos la piedra
                                PiedraVolta.Curar(volta);
                                PiedraVolta.Pegar(volta);
                            }
                            System.out.println(MatarEnemigo(enemigo,volta));
                        }
                        //Terre Tiene mas LvL
                        else{
                            System.out.println(MatarEnemigo(enemigo,terre));
                        }

                    }
                    //Tiene las tres Mascotas
                    else{
                        //Volta Tiene Mas LvL
                        if (volta.getLvLMascota() > terre.getLvLMascota() && volta.getLvLMascota() > acua.getLvLMascota()
                        ){
                            //Si Volta Tiene Piedras se ultizan
                            if(volta.setTienePiedras()){
                                PiedraVolta.Curar(volta);
                                PiedraVolta.Pegar(volta);
                            }
                            System.out.println(MatarEnemigo(enemigo,volta));
                        }
                        //Terre Tiene Mas LvL
                        else if(terre.getLvLMascota() > volta.getLvLMascota() && terre.getLvLMascota() > acua.getLvLMascota()){
                            System.out.println(MatarEnemigo(enemigo,terre));
                        }
                        //Acua Tiene Mas LvL
                        else{
                            System.out.println(MatarEnemigo(enemigo,acua));
                        }
                    }
                }
                //No tiene Mascota
                else{
                    System.err.println("Error: No tiene ninguna mascota!");
                }

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
                    if (QuienHaMuerto(principal, acua) == true){
                        principal.SonidoGanar();
                        // Elegir si quiere capturarlo
                        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                        System.out.println("Quieres Capturar a Acua? \n a) SI \nCualquier otro valor) No");

                        Elecion = myObj.nextLine();  // Read user input

                        Elecion = Elecion.toLowerCase();
                        if (Elecion.equals("a")){
                            //Aqui lo convertiremos en un SET asi no se puede repetir la mascota
                            principal.añadirMascotas(acua);
                        }
                    }
                    else{
                        principal.SonidoPerder();
                    }
                }


            }
            //---------------Mirar Estadisticcas y mascotas -----------------------
            else if (Elecion.equals("c")) {
                //Elecion de que quiere Mirar
                while (true) {
                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("a) Tus Estadisticas\nb)Volta\nc)Terre\nd)Acua");

                    Elecion = myObj.nextLine();  // Read user input

                    Elecion = Elecion.toLowerCase();
                    //Mirar si el dato de entrada tiene sentido sino repite la ejecucion
                    if (Elecion.equals("a") || Elecion.equals("b") || Elecion.equals("c") || Elecion.equals("d")) {
                        break;
                    } else {
                        System.err.println("Error: No has elegido una opcion valida\n");

                    }
                }
                // Segun la elecion que haga se mostraran una Estadiscticas u otras
                if(Elecion.equals("a")){
                    principal.VerEstadisticas();
                }
                else if(Elecion.equals("b")){
                    //Booleano Que mira si el personaje principal tiene a la Mascota
                    boolean EstaVolta = principal.getMascotas().contains(volta);
                    //Si la tiene Muestra por pantalla sus Estadisticas
                    if (EstaVolta == true){
                        volta.VerEstadisticaVolador();
                    }
                    //Sino las tiene Muesta por pantalla un error
                    else{
                        System.err.println("No tienes a Volta en tu equipo");
                    }
                }
                else if(Elecion.equals("c")){
                    boolean EstaTerre = principal.getMascotas().contains(terre);
                    if (EstaTerre == true){
                        terre.VerEstadisticaVolador();
                    }
                    else{
                        System.err.println("Usted no tiene a Terre en su equipo");
                    }
                }
                else{
                    boolean EstaAcua = principal.getMascotas().contains(acua);
                    if (EstaAcua == true){
                        acua.VerEstadisticaVolador();
                    }
                    else{
                        System.err.println("Usted no tiene a Acua en su equipo");
                    }
                }
            }
            else if(Elecion.equals("e")){
                System.out.print("Saliendo del Juego");
                //Animacion de Salir del juego
                for(int i = 0  ; i < 3; i++){
                    TiempoEspera();
                    System.out.print(".");
                }
                break;
            }
            //-------------- Entrenar --------------------------
            else {
                System.out.println("Entrenado...");
                //TiempoEspera();
                //Sistema de elecion de quien a entrenar
                String Aquien;
                while(true){
                    Scanner myObj = new Scanner(System.in);  // Creamos esl objeto escaner
                    System.out.println("A quien quires entrenar \na)A ti mismo\nb)Volta\nc)Terre\nd)Acua");

                    Aquien = myObj.nextLine();

                    Aquien = Aquien.toLowerCase();
                    //Mirar si el dato de entrada tiene sentido sino repite la ejecucion
                    if (Aquien.equals("a") || Aquien.equals("b") || Aquien.equals("c") || Aquien.equals("d")) {
                        if (Aquien.equals("a")){
                            System.out.println("Entrenando...");
                            //Aqui vendra una pausa de 10 segundos
                            //Elecion de que quiere mejorar
                            principal.SubirLvL();
                            break;
                        }
                        //Si elegie a VOLTA y lo tiene
                        else if (Aquien.equals("b") && principal.getMascotas().contains(volta) == true){
                            System.out.println("Entrenando... VOlta");
                            volta.AñadirPiedras(PiedraVolta);
                            volta.SubirLvL();
                            break;
                        }
                        //Si elige a TERRE y lo tiene
                        else if (Aquien.equals("c") && principal.getMascotas().contains(terre) == true){
                            System.out.println("Entrenando... Terre");
                            terre.SubirLvL();
                            break;
                        }
                        else if(Aquien.equals("d") && principal.getMascotas().contains(acua) == true){
                            System.out.println("Entrenando... Acua");
                            acua.SubirLvL();
                            break;
                        }

                        else {
                            System.err.println("Error: No tienes esta mascota\n");

                        }
                    }
                    else {
                        System.err.println("Error: No has elegido una opcion valida\n");

                    }
                }



            }
        //Si a la mascota No le quedan Piedras La damos como false
            volta.NoTienePiedras(PiedraVolta);

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

//-------------------Mejorar Sistema de Pelea (29/04/2024)------------------------------------------------------------------------------------------
    // Matar Enemeigos
    public static String MatarEnemigo(Malvados enemigo, MascotasPrincipal Mascota) {
        String Ganar = "You: Lo sabia no hay nadie en este mundo que pueda conmigo";
        String Perder = "You: Vuelve aqui" + Mascota.getNombreMascota() + ", sino moriras!!!";
        for (int i = 0; i < Mascota.getEstaminaMascota(); i++) {
            String Elecion;
            //Sistema de Pelea donde eligen los ataques
            while (true) {
                Scanner myObj = new Scanner(System.in);
                myObj = new Scanner(System.in);
                // Creamos esl objeto escaner
                System.out.println("Eliga el Ataque: \na)" + Mascota.getAtaque1() + "\nb)" + Mascota.getAtaque2());
                Elecion = myObj.nextLine();


                Elecion = Elecion.toLowerCase();
                //Mirar si el dato de entrada tiene sentido sino repite la ejecucion
                if (Elecion.equals("a") || Elecion.equals("b")) {
                    break;
                } else {
                    System.err.println("Error: No has elegido una opcion valida\n");

                }
            }
            //Pelea
            if (Elecion.equals("a")) {
                Mascota.SonidoAtaque1();
                enemigo.setVidaMalvado(enemigo.getVidaMalvado() - Mascota.getDañoMascota());
                TiempoEspera();
                enemigo.Sonido_daño();
                //Aqui va el sonido de dolor del Malvado
                if (enemigo.getVidaMalvado() <= 0) {
                    return Ganar;
                }
                Mascota.setVidaMascota(Mascota.getVidaMascota() - enemigo.getDañoMalvado());

                Mascota.sonido();
                TiempoEspera();
                enemigo.Sonido_pegar();
                if (Mascota.getVidaMascota() <= 0) {
                    return Perder;
                }
            } else {

                Mascota.SonidoAtaque2();
                Mascota.setVidaMascota(Mascota.getVidaMascota() - enemigo.getDañoMalvado());
                enemigo.Sonido_pegar();
                TiempoEspera();
                Mascota.SonidoMascota();
                if (Mascota.getVidaMascota() <= 0) {
                    return Perder;
                }
                enemigo.setVidaMalvado(enemigo.getVidaMalvado() - Mascota.getDañoMascota() * 2);
                enemigo.Sonido_daño();
                TiempoEspera();
                //Aqui va el sonido de dolor del Malvado
                if (enemigo.getVidaMalvado() <= 0) {
                    return Ganar;
                }
            }
        }

        return Perder;
    }
}



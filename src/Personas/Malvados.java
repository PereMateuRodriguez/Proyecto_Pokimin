package Personas;

public class Malvados {
    private int vida;
    private int daño;
    private int velocidad;


    //Constructor
    public Malvados(int vida, int daño, int velocidad){
        this.velocidad = velocidad;
        this.vida = vida;
        this.daño = daño;
    }




    //GET y SET
    //get return
    public int getVidaMalvado(){
        return vida;
    }
    //Set
    public void setVidaMalvado(int vida){
        this.vida = vida;
    }
    //Get Y set Daño
    //get daño
    public int getDañoMalvado(){
        return daño;
    }
    //set Daño
    public void setDañoMalvado(int daño){
        this.daño = daño;
    }
    //Get y set Velocidad
    public int getVelocidadMalvado(){
        return velocidad;
    }
    public void setVelocidadMalvado(int velocidad){
        this.velocidad = velocidad;
    }

}

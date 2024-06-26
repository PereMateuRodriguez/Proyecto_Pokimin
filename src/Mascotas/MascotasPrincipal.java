package Mascotas;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

abstract public class MascotasPrincipal {
    private String Ataque1;
    private String Ataque2;
    private String Nombre;
    private int vida;
    private int daño;
    private int estamina;
    private int velocidad;
    private int LvL;

    //Constructor
    public MascotasPrincipal(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL, String Ataque1, String Ataque2){
        this.Nombre = Nombre;
        this.vida = vida;
        this.daño = daño;
        this.estamina = estamina;
        this.velocidad = velocidad;
        this.LvL = LvL;
        this.Ataque1 = Ataque1;
        this.Ataque2 = Ataque2;
    }

    //Metodos

    abstract public void sonido();
    //Sonido
    abstract public void SonidoMascota();
    abstract  public void SonidoAtaque1();
    abstract  public void SonidoAtaque2();

    //SET Y GET Nombre
    public String getNombreMascota(){
        return Nombre;
    }
    //SET
    public void setNombreMascota(String Nombre){
        this.Nombre = Nombre;
    }
    //SET y GET VIDA
    //GET
    public int getVidaMascota(){
        return vida;
    }
    //SET
    public void setVidaMascota(int vida){
        this.vida = vida;
    }

    //GET y SET
    //GET
    public int getDañoMascota(){
        return daño;
    }
    //SET
    public void setDañoMascota(int daño){
        this.daño = daño;
    }
    //GET y SET ESTAMINA
    //GET
    public int getEstaminaMascota(){
        return estamina;
    }
    //SET
    public void setEstaminaMascota(int estamina){
        this.estamina = estamina;
    }
    //GET Y SET VELOCIDAD
    //GET
    public int getVelocidadMascota(){
        return velocidad;
    }
    //SET
    public void setVelocidadMascota(int velocidad){
        this.velocidad = velocidad;
    }
    //GET Y SET LvL
    public int getLvLMascota(){
        return  LvL;
    }
    //SET
    public void setLvLMascota(int LvL){
        this.LvL = LvL;
    }

    public String getAtaque1(){ return Ataque1; }
    public void setAtaque1(String Ataque1){ this.Ataque1 = Ataque1;}

    public String getAtaque2(){ return Ataque2; }
    public void setAtaque2(String Ataque2){ this.Ataque2 = Ataque2;}

}

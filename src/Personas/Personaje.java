package Personas;

public class Personaje {
    // Atributos Del Personaje Principal
    private int vida;
    private int daño;
    private int estamina;
    private int velocidad;
    private int LvL;

    //Contrusctor
    public Personaje(int vida, int daño, int estamina, int velocidad, int LvL){
        this.vida = vida;
        this.daño = daño;
        this.estamina =  estamina;
        this.velocidad = velocidad;
        this.LvL = LvL;
    }

    //Metodos

    //Ver las estadisticas
    public void VerEstadisticas(){
        System.out.println("Tus estadisticas son: \n");
        System.out.println("Vida      :" + this.getVida());
        System.out.println("Daño      :" + this.getDaño());
        System.out.println("Estamina  :" + this.getEstamina());
        System.out.println("Velocidad :" + this.getVelocidad());
        System.out.println("LvL       :" + this.getLvL());
    }
    public void SonidoDar(){
        System.out.println("You: Toma eso ha tenido que doler!!!");
    }

    public void SonidoPerder(){
        System.out.println("You: Mierda me tendre que ir sino morire!!!");
    }
    public void SonidoGanar(){
        System.out.println("You: JAJA, lo que yo decia no puedes contra MI!!!");
    }

    // SET y GET Vida
    // GET
    public int getVida(){
        return vida;
    }
    //SET
    public void setVida(int vida){
        this.vida = vida;
    }
    //SET y GET Daño
    //GET
    public int getDaño(){
        return daño;
    }
    //SET
    public void setDaño(int daño){
        this.daño = daño;
    }
    //SET y GET de Estamina
    //GET
    public int getEstamina(){
        return estamina;
    }
    //SET
    public void setEstamina(int estamina){
        this.estamina = estamina;
    }
    //SET y GET Velocidad
    //SET
    public int getVelocidad(){
        return velocidad;
    }
    //GET
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    //GET y SET LvL
    public int getLvL(){
        return LvL;
    }
    //sET
    public void setLvL(int LvL){
        this.LvL = LvL;
    }



}

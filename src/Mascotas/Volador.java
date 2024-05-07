package Mascotas;

import Materiales.PiedraVolador;

import java.util.ArrayList;

public class Volador extends MascotasPrincipal{

    private boolean TienePiedraVoladora;

    //Constructor
    public Volador(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL, String Ataque1, String Ataque2, boolean TienePiedraVoladora) {
        super(Nombre, vida, daño, estamina, velocidad * 2, LvL, Ataque1, Ataque2);
        this.TienePiedraVoladora = TienePiedraVoladora;
    }
    //El ataque 1 es una ataque mas rapido pero que gasta poca energia e hace poco daño
    public void SubirLvL(){
        setVidaMascota(getVidaMascota() + 10);
        setDañoMascota(getDañoMascota() + 1);
        setLvLMascota(getLvLMascota() + 1);
        setVelocidadMascota(getVelocidadMascota() + 5);
        VerEstadisticaVolador();
    }
    //AñadorPiedras
    public void AñadirPiedras(PiedraVolador p, Volador m){
        p.SonidoAñardirPiedra();
        m.setTienePiedras(true);
        p.setUso(p.getUso() + 1);
    }
    //Miramos que la piedra de volta tenga usos Sino tiene le metemos el valor False
    public void NoTienePiedras(PiedraVolador p, Volador m){
        if (p.CuantoUso() == false ){
            m.setTienePiedras(false);
        }
    }
    //Set de piedras
    public boolean getTienePiedras(){
        return TienePiedraVoladora;
    }
    //Get De piedras
    public void setTienePiedras(boolean Piedras){
        this.TienePiedraVoladora = Piedras;
    }

    public void VerEstadisticaVolador(){
        System.out.println("Las estadistas de " + getNombreMascota()+ "son:\n" + "Vida     :" + getVidaMascota() + "\nDaño     :" + getDañoMascota() + "\nEstamina :" + getEstaminaMascota() +"\nVelocidad:"  + getVelocidadMascota() + "\nLvL      :" + getLvLMascota() );
    }
    @Override
    public void sonido() {
        System.out.println("AIGHH");
    }

    @Override
    public void SonidoMascota() {
        System.out.println("AGHITTT AGHITTT!!");
    }

    @Override
    public void SonidoAtaque1() {
        System.out.println("You: Volta Ataque Rapido");

    }

    @Override
    public void SonidoAtaque2(){
        System.out.println("You: Volta Ala de Acero!!!");
    }
    }



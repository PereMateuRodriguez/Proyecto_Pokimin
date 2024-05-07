package Mascotas;

import Materiales.PiedraAcuatico;

public class Acuatico extends MascotasPrincipal{
    private boolean TienePiedrasAcuaticas;
    public Acuatico(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL, String Ataque1, String Ataque2, boolean TienePiedrasAcuaticas) {
        super(Nombre, vida, daño, estamina, velocidad, LvL, Ataque1, Ataque2);
        this.TienePiedrasAcuaticas = TienePiedrasAcuaticas;
    }
    public void SubirLvL(){
        setVidaMascota(getVidaMascota() + 100);
        setDañoMascota(getDañoMascota() + 50);
        setLvLMascota(getLvLMascota() + 1);
        setVelocidadMascota(getVelocidadMascota() + 2);
        VerEstadisticaVolador();
    }
    //Metodos
    public void AñadirPiedrasAcuataticas(PiedraAcuatico p, Acuatico m){
        p.SonidoAñadirPiedra();
        m.setTienePiedrasAcuaticas(true);
        p.setPoder(p.getPoder()+1);
    }
    //Get y set
    public boolean getTienePiedrasAcuaticas(){
        return TienePiedrasAcuaticas;
    }
    public void setTienePiedrasAcuaticas(boolean TienePiedrasAcuaticas){
        this.TienePiedrasAcuaticas = TienePiedrasAcuaticas;
    }
    public void VerEstadisticaVolador(){
        System.out.println("Las estadistas de " + getNombreMascota()+ "son:\n" + "Vida     :" + getVidaMascota() + "\nDaño     :" + getDañoMascota() + "\nEstamina :" + getEstaminaMascota() +"\nVelocidad:"  + getVelocidadMascota() + "\nLvL      :" + getLvLMascota() );
    }
    @Override
    public void SonidoAtaque1(){
        System.out.println("You: Acua Chorro Presion");
    }
    @Override
    public void SonidoAtaque2(){
        System.out.println("You: Acua Cascada de HydroMuertos!!!");
    }
    @Override
    public void sonido() {
        System.out.println("blu blu");
    }

    @Override
    public void SonidoMascota() {
        System.out.println("blu");
    }
}

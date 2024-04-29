package Mascotas;

public class Acuatico extends MascotasPrincipal{
    public Acuatico(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL, String Ataque1, String Ataque2) {
        super(Nombre, vida, daño, estamina, velocidad, LvL, Ataque1, Ataque2);
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

package Mascotas;

public class Terrestre extends MascotasPrincipal{
    public Terrestre(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL, String Ataque1, String Ataque2) {
        super(Nombre, vida, daño, estamina, velocidad, LvL, Ataque1, Ataque2);
    }
    public void SubirLvL(){
        setVidaMascota(getVidaMascota() + 50);
        setDañoMascota(getDañoMascota() + 5);
        setLvLMascota(getLvLMascota() + 1);
        setVelocidadMascota(getVelocidadMascota() + 2);
        VerEstadisticaVolador();
    }
    public void VerEstadisticaVolador(){
        System.out.println("Las estadistas de " + getNombreMascota()+ "son:\n" + "Vida     :" + getVidaMascota() + "\nDaño     :" + getDañoMascota() + "\nEstamina :" + getEstaminaMascota() +"\nVelocidad:"  + getVelocidadMascota() + "\nLvL      :" + getLvLMascota() );
    }
    @Override
    public void SonidoAtaque1(){
        System.out.println("You: Terre Ataque Latigo");
    }
    @Override
    public void SonidoAtaque2(){
        System.out.println("You: Terre Raizes Duras!!!");
    }

    @Override
    public void sonido() {
        System.out.println("OUGHTTT OGHTTT");
    }

    @Override
    public void SonidoMascota() {
        System.out.println("OUGHTTT");
    }
}

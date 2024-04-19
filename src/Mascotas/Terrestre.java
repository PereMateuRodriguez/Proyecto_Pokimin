package Mascotas;

public class Terrestre extends MascotasPrincipal{
    public Terrestre(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL) {
        super(Nombre, vida, daño, estamina, velocidad, LvL);
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

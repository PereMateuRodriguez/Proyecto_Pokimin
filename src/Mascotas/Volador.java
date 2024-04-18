package Mascotas;

public class Volador extends MascotasPrincipal{

    //Constructor
    public Volador(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL) {
        super(Nombre, vida, daño, estamina, velocidad, LvL);
    }

    @Override
    public void sonido() {
        System.out.println("AIGHH");
    }

    @Override
    public void SonidoMascota() {
        System.out.println("AGHITTT AGHITTT!!");
    }
}

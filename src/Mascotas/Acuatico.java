package Mascotas;

public class Acuatico extends MascotasPrincipal{
    public Acuatico(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL) {
        super(Nombre, vida, daño, estamina, velocidad, LvL);
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

package Materiales;

import Mascotas.MascotasPrincipal;

public class PiedraVolador implements PiedrasMagicas{
    private int uso;

    //Contructor
    public PiedraVolador(int uso){
        this.uso = uso;
    }

    //Metodo si tenemos usos
    public boolean CuantoUso(){
        if (getUso() <= 0){
            return false;
        }
        else{
            return true;
        }
    }
    //Sonido de Piedra
    public void SonidoAñardirPiedra(){
        System.out.println("Añadiendo la piedra Voladora!");
    }
    @Override
    public void Pegar(MascotasPrincipal m) {
        m.setDañoMascota(m.getDañoMascota() + 20);
    }

    @Override
    public void Curar(MascotasPrincipal m) {
        m.setVidaMascota(100);
    }
    //Get y set
    public int getUso(){
        return uso;
    }
    public void setUso(int uso){
        this.uso = uso;
    }

}

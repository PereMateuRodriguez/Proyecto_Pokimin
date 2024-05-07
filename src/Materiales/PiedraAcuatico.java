package Materiales;

import Mascotas.MascotasPrincipal;

public class PiedraAcuatico implements PiedrasMagicas {
    private int poder;

    //Contructor
    public PiedraAcuatico(int pdoer){
        this.poder = poder;
    }

    // Metodos
    //Sonido de añadir Piedras
    public void SonidoAñadirPiedra(){
        System.out.println("Añadiendo Piedra de Tipo Acuatica!!!");
    }
    //Segun el poder se hara tanta veces
    public void PoderCurarPegar(MascotasPrincipal m , PiedraAcuatico p){
        for (int i = 0; i < p.getPoder(); i++){
            p.Curar(m);
            p.Pegar(m);
        }
    }



    //Get y Set
    public int getPoder(){
        return poder;
    }
    public void setPoder(int poder){
        this.poder = poder;
    }

    @Override
    public void Pegar(MascotasPrincipal m) {
        m.setDañoMascota(m.getDañoMascota() + 250);
    }

    @Override
    public void Curar(MascotasPrincipal m) {
        m.setVidaMascota(1000);
    }


}

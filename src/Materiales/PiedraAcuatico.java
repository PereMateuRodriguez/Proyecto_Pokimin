package Materiales;

import Mascotas.MascotasPrincipal;

public class PiedraAcuatico implements PiedrasMagicas {
    private int uso;

    //Contructor
    public PiedraAcuatico(int uso){
        this.uso = uso;
    }



    //Get y Set
    public int getUso(){
        return uso;
    }
    public void setUso(int uso){
        this.uso = uso;
    }

    @Override
    public void Pegar(MascotasPrincipal m) {
        m.setDañoMascota(m.getDañoMascota() + 250);
        setUso(getUso()-1);
    }

    @Override
    public void Curar(MascotasPrincipal m) {
        m.setVidaMascota(1000);
        setUso(getUso()-1);
    }
}

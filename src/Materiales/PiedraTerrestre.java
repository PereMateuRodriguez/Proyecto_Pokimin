package Materiales;

import Mascotas.MascotasPrincipal;

public class PiedraTerrestre implements PiedrasMagicas{
    private int uso;
    //Contructor
    public PiedraTerrestre(int uso){
        this.uso = uso;
    }



    //Get y set
    public int getUso(){
        return uso;
    }
    public void setUso(int uso){
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

    @Override
    public void Pegar(MascotasPrincipal m) {
        m.setDañoMascota(m.getDañoMascota() + 100);
        setUso(getUso()-1);
    }

    @Override
    public void Curar(MascotasPrincipal m) {
        m.setVidaMascota(200);
        setUso(getUso()-1);
    }
}

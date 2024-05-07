package Mascotas;

import Materiales.PiedraTerrestre;
import Materiales.PiedraVolador;

public class Terrestre extends MascotasPrincipal{
    private boolean TienePiedrasVoladora;
    private boolean TienePiedrasTerretres;
    public Terrestre(String Nombre, int vida, int daño, int estamina, int velocidad, int LvL, String Ataque1, String Ataque2, boolean TienePiedrasVoladoras, boolean TienePiedrasTerretres) {
        super(Nombre, vida, daño, estamina, velocidad, LvL, Ataque1, Ataque2);
        this.TienePiedrasVoladora =  TienePiedrasVoladoras;
        this.TienePiedrasTerretres = TienePiedrasTerretres;

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
    //Añadir Piedra Tipo Volador
    public void AñadirPiedrasVoladoras(PiedraVolador p, Terrestre t ){
        p.SonidoAñardirPiedra();
        t.setTienePiedrasVoladora(true);
        p.setUso(p.getUso()+ 1);
    }
    //Añadir Piedra Tipo Terretreste
    public void AñadirPiedrasTerrestre(PiedraTerrestre p, Terrestre t){
        p.SonidoAñadirPiedraTerrestre();
        t.setTienePiedrasTerretres(true);
        p.setUso(p.getUso()+1);
    }
    //Mira si La Piedra magica de tipo Volador Tiene usos
    public void NotienePiedrasVoladoras(PiedraVolador p, Terrestre t){
        if (p.CuantoUso() == false){
            t.setTienePiedrasVoladora(false);
        }
    }
    // Mirar Si la piedra magica de tipo terretes tienee usos
    public void NotienePiedrasTerretres(PiedraTerrestre p, Terrestre t){
        if (p.CuantoUso() == false){
            t.setTienePiedrasTerretres(false);
        }
    }


    //Get y set
    public boolean getTienePiedrasVoladora(){
        return TienePiedrasVoladora;
    }
    public void setTienePiedrasVoladora(boolean TienePiedrasVoladoras){
        this.TienePiedrasVoladora = TienePiedrasVoladoras;
    }
    public boolean getTienePiedrasTerrestres(){
        return TienePiedrasTerretres;
    }
    public void setTienePiedrasTerretres(boolean TieneiedrasTerrestres){
        this.TienePiedrasTerretres = TieneiedrasTerrestres;
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

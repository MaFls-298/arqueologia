package model;

public class GraficoPie extends Grafico {
    private int secciones;

    public GraficoPie(int idGrafico, String titulo, String descripcion, int secciones){
        super(idGrafico, titulo, descripcion);
        this.secciones = secciones;
    }

    @Override
    public void generarGrafico(){

    }
}

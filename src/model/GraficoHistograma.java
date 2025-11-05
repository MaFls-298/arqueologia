package model;

public class GraficoHistograma extends Grafico {

    private int intervalos;
    public GraficoHistograma(int idGrafico, String titulo, String descripcion, int intervalos){
        
        super(idGrafico, titulo, descripcion);
        this.intervalos = intervalos;
    }

    @Override
    public void generarGrafico(){

    }
}

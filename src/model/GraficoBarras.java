package model;

public class GraficoBarras extends Grafico{
    private String xLabel;
    private String yLabel;

    public GraficoBarras(int idGrafico, String titulo, String descripcion, String xLabel, String yLabel){
        super(idGrafico, titulo, descripcion);
        this.xLabel = xLabel;
        this.yLabel = yLabel;
    }

    @Override
    public void mostrarDetalles(){

    }
}

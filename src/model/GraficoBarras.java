package model;

public class GraficoBarras extends Grafico{
    private String xLabel;
    private String yLabel;
    private int noColumnas;
    

    public GraficoBarras(int idGrafico, String titulo, String descripcion, String xLabel, String yLabel, int noColumnas){
        super(idGrafico, titulo, descripcion);
        this.xLabel = xLabel;
        this.yLabel = yLabel;
        this.noColumnas = noColumnas;
    }

    @Override
    public void generarGrafico(){

    }

    public String getXLabel(){
        return xLabel;
    }

    public String getYLabel(){
        return yLabel;
    }

    public int getColumnas(){
        return noColumnas;
    }

    
}


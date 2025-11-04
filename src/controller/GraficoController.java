package controller;
import java.util.ArrayList;
import model.*;

public class GraficoController {
    private ArrayList<Grafico> graficos;

    public GraficoController() {
        this.graficos = new ArrayList<>();
    }

    
    public GraficoBarras crearGraficoBarras(int idGrafico, String titulo, String descripcion, String xLabel, String yLabel, int noColumnas) {
        GraficoBarras g = new GraficoBarras(idGrafico, titulo, descripcion, xLabel, yLabel, noColumnas);
        graficos.add(g);
        return g;
    }

    
    public GraficoHistograma crearGraficoHistograma(int idGrafico, String titulo, String descripcion, int numIntervalos) {
        GraficoHistograma g = new GraficoHistograma(idGrafico, titulo, descripcion, numIntervalos);
        graficos.add(g);
        return g;
    }

    public Grafico buscarGraficoPorId(int idGrafico) {
        for (Grafico g : graficos) {
            if (g.getIdGrafico() == idGrafico) return g;
        }
        return null;
    }

    
    public void eliminarGrafico(int idGrafico) {
        
    }

    public ArrayList<Grafico> listarGraficos() {
        return graficos;
    }
}

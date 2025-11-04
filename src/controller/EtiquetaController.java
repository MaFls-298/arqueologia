package controller;
import java.util.ArrayList;
import model.Etiqueta;
import model.EtiquetaCategoria;
import model.EtiquetaComentario;

public class EtiquetaController {
    private ArrayList<Etiqueta> etiquetas;

    public EtiquetaController() {
        this.etiquetas = new ArrayList<>();
    }

    public Etiqueta crearEtiquetaCategoria(int id, String titulo, String color, String descripcion, String categoria) {
        EtiquetaCategoria etiqueta = new EtiquetaCategoria(id, titulo, color, descripcion, categoria);
        etiquetas.add(etiqueta);
        return etiqueta;
    }

    public Etiqueta crearEtiquetaComentario(int id, String titulo, String color, String descripcion, String comentario) {
        EtiquetaComentario etiqueta = new EtiquetaComentario(id, titulo, color, descripcion, comentario);
        etiquetas.add(etiqueta);
        return etiqueta;
    }

    public Etiqueta crearEtiquetaSujeto(int id, String titulo, String color, String descripcion, String sujeto){
        EtiquetaSujeto etiqueta = new EtiquetaSujeto(id, titulo, color, descripcion, sujeto);
        etiquetas.add(etiqueta);
        return etiqueta;
    }

    public Etiqueta crearEtiquetaTema(int id, String titulo, String color, String descripcion, String tema){
        EtiquetaTema etiqueta = new EtiquetaTema(id, titulo, color, descripcion, tema);
        etiquetas.add(etiqueta);
        return etiqueta;
    }


}

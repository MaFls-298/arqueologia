package model;

public class EtiquetaTema extends Etiqueta {
    private String tema;

    public EtiquetaTema(int id, String titulo, String color, String descripcion, String categoria) {
        super(id, titulo, color, descripcion);
        this.tema = categoria;
    }

    @Override
    public void mostrarDetalles() {
        
    }
}


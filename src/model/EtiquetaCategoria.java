package model;

public class EtiquetaCategoria extends Etiqueta {
    
    private String categoria;

    public EtiquetaCategoria(int id, String titulo, String descripcion, String color, String categoria) {
        super(id, titulo, color, descripcion);
        this.categoria = categoria;
    }

    @Override
    public void mostrarDetalles() {
    
    }

}

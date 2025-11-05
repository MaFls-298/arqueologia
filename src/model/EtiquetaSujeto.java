package model;

public class EtiquetaSujeto extends Etiqueta {
    private String nombre;

    public EtiquetaSujeto(int id, String titulo, String descripcion, String color, String nombre) {
        super(id, titulo, color, descripcion);
        this.nombre = nombre;
    }

    @Override
    public void mostrarDetalles() {
    
    }
}

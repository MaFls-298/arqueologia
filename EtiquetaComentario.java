public class EtiquetaComentario extends Etiqueta {
    
    private String comentario;

    public EtiquetaComentario(int id, String titulo, String descripcion, String color, String categoria) {
        super(id, titulo, color, descripcion);
        this.comentario = comentario;
    }

    @Override
    public void mostrarDetalles() {
    
    }
}

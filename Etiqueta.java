public abstract class Etiqueta {
    private int id;
    public String titulo;
    public String color;
    public String descripcion;

    public Etiqueta(int id, String titulo, String color, String descripcion){
        this.id = id;
        this.titulo = titulo;
        this.color = color;
        this.descripcion = descripcion;
    }

    public abstract void mostrarDetalles();
}


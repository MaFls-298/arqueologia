package model;

public class Relacion {
    private int ident;
    private Etiqueta elementoOrigen;
    private Etiqueta elementoDestino;
    private String categoriaRelacion;

    public Relacion(int ident, Etiqueta elementoOrigen, Etiqueta elementoDestino, String categoriaRelacion){
        this.ident = ident;
        this.elementoOrigen = elementoOrigen;
        this.elementoDestino = elementoDestino;
        this.categoriaRelacion = categoriaRelacion;
    }

    public void definirRelacion(Etiqueta etiqueta){
        //.
    }

    public void setOrigen(Etiqueta etiqueta){

    }

    public void setDestino(Etiqueta etiqueta){

    }

    public int getIdent(){
        return ident;
    }

    public Etiqueta getOrigen(){
        return elementoOrigen;
    }

    public Etiqueta getDestino(){
        return elementoDestino;
    }

    public String getCategoria(){
        return categoriaRelacion;
    }
}

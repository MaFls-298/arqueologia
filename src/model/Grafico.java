package model;

public abstract class Grafico {
    private int idGrafico; 
    private String titulo;
    private String descripcion;

    public Grafico(int idGrafico, String titulo, String descripcion){
        this.idGrafico = idGrafico;
        this.titulo = titulo;
        this.descripcion = descripcion;
        
    }
    
    public abstract void generarGrafico();

    public void generarId(){

    }

    public int getIdGrafico(){
        return idGrafico;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }
}

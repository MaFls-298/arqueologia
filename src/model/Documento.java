package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Documento {
    private int id;
    private String titulo;
    private String autor;
    private int wordCount;
    private String contenido;
    private String rutaFile;
    private LocalDate fechaCarga;
    private ArrayList<Etiqueta> etiquetas;


    public Documento(int id, String titulo, String autor, String contenido, String rutaFile, LocalDate fechaCarga, ArrayList<Etiqueta> etiquetas){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.wordCount = 0;
        this.contenido = contenido;
        this.rutaFile = rutaFile;
        this.fechaCarga = fechaCarga;
        this.etiquetas = etiquetas;

    }

    public void agregarEtiqueta(Etiqueta etiqueta){

    }
    public ArrayList<Etiqueta> getEtiquetas(){
        return etiquetas;    
    }

    public int generarIdDoc(){
        return id;
    }

    public void crearResumen(){
        
    }

    public int contarPalabras(){
        return wordCount;
    }

    public void setNewFilePath(){

    }

    public int getIdDoc(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public LocalDate getFechaCarga(){
        return fechaCarga;
    }
    
    public String getContenido(){
        return contenido;
    }

    public String getFilePath(){
        return rutaFile;
    }


}

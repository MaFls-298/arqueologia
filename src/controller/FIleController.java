package controller;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

import files.*;

public class FIleController {
    private ArrayList<Documento> documentos;

    public FIleController(){
        this.documentos = new ArrayList<>();
    }

    public Documento agregarDocumento(int id, String titulo, String autor, String rutaFile, String contenido) {
        Documento doc = new Documento(id, titulo, autor, contenido, rutaFile, LocalDate.now());
        documentos.add(doc);
        return doc;
    }

    public Documento searchByName(String titulo){
        for (Documento d : documentos) {
            if (d.getTitulo() == titulo) return d;
        }
        return null;
    }

    public void eliminarDocumento(Documento documento){

    }

    public void addEtiqueta(int id, Etiqueta etiqueta){

    }

    public int getWordCount(Documento doc){
        return doc.getContenido().split("\\s+").length;
    }
}

package controller;
import java.util.ArrayList;
import model.*;

public class RelacionController {
    private ArrayList<Relacion> relaciones;

    public RelacionController() {
        this.relaciones = new ArrayList<>();
    }

    
    public Relacion crearRelacion(int ident, Etiqueta origen, Etiqueta destino, String categoriaRelacion) {
        Relacion r = new Relacion(ident, origen, destino, categoriaRelacion);
        relaciones.add(r);
        return r;
    }

    
    public Relacion buscarRelacionPorId(int id) {
        for (Relacion r : relaciones) {
            if (r.getIdent() == id) return r;
        }
        return null;
    }

    
    public void eliminarRelacion(int id) {
        
    }

    
    public ArrayList<Relacion> listarRelaciones() {
        return relaciones;
    }

    public ArrayList<Relacion> getRelacionesPorEtiqueta(Etiqueta e) {
        ArrayList<Relacion> result = new ArrayList<>();
        for (Relacion r : relaciones) {
            if (r.getOrigen().equals(e) || r.getDestino().equals(e)) {
                result.add(r);
            }
        }
        return result;
    }
}


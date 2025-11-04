package fileAdmin;
import java.time.LocalDate;

import model.Documento;

public class txtImport implements FileImport{
    
    @Override
    public boolean validarFileType(String rutaArchivo) {
        return rutaArchivo.toLowerCase().endsWith(".txt");
    }

    @Override
    public Documento importar(String filePath){
        try {
            return new Documento(id, titulo, autor, contenido, rutaFile, LocalDate.now());
        } catch (Exception e) {
            return null;
        }
    }
}

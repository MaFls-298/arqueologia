package fileAdmin;
import java.time.LocalDate;

import model.Documento;

public class PdfImport implements FileImport {

    @Override
    public boolean validarFileType(String rutaArchivo) {
        return rutaArchivo.toLowerCase().endsWith(".pdf");
    }

    @Override
    public Documento importar(String rutaArchivo) {
    try {
            return new Documento(id, titulo, autor, contenido, rutaFile, LocalDate.now());
        } catch (Exception e) {
            return null;
        }
    }
}

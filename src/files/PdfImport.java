package files;
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
            return new Documento();
        } catch (Exception e) {
            return null;
        }
    }
}

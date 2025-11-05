package files;
import model.Documento;

public interface FileImport {
    Documento importar(String rutaArchivo);
    boolean validarFileType(String rutaArchivo);
}

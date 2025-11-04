package fileAdmin;
import model.Documento;

public interface FileImport {
    Documento importar(String rutaArchivo);
    boolean validarFileType(String rutaArchivo);
}

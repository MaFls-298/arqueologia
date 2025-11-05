package files;

import java.time.LocalDate;

import model.Documento;

public class DocxImport implements FileImport{
    
    @Override
    public boolean validarFileType(String rutaArchivo) {
        return rutaArchivo.toLowerCase().endsWith(".docx");
    }

    @Override
    public Documento importar(String filePath){
        try {
            return new Documento();
        } catch (Exception e) {
            return null;
        }
    }
}
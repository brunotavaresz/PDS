package ex3;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class Document {

    private final String Nfile;
    public Document(String Nfile) {
        this.Nfile = Nfile;
    }
    public String getNfile() {
        return Nfile;
    }

    public String[] getDados() {
        List<String> lin = null;

        try{
            lin = Files.readAllLines( new File(Nfile).toPath() );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lin.toArray(new String[0]);
    }

    @Override
    public String toString() {
        String[] lines = getDados();
        StringBuilder dados = new StringBuilder();
        dados.append(lines[0], 0, Math.min(20, lines[0].length() - 1)).append("...");
        return dados.toString();
    }
}
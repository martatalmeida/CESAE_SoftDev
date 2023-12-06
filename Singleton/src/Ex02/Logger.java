package Ex02;

import java.io.*;

public class Logger {

    private String nomeFicheiro;
    private static Logger instance;


    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public static Logger getInstance(String nomeFicheiro) throws IOException {
        if (instance == null){
            instance = new Logger(nomeFicheiro);
        }
        return instance;
    }


    public void log(String linha) throws IOException {
        File file = new File(this.nomeFicheiro);
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.append(linha + "\n");
        fileWriter.close();
    }
}

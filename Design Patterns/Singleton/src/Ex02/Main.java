package Ex02;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Logger logger = Logger.getInstance("application_log.txt");
        Logger logger2 = Logger.getInstance("programa_log.txt");

        logger.log("Mensagem de log 1");
        logger.log("Mensagem de log 2");

        logger2.log("Mensagem");

    }
}

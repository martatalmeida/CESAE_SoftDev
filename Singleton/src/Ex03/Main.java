package Ex03;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        UserSessionManager userSessionManager = UserSessionManager.getInstance();

        System.out.println("Token de Acesso: " + userSessionManager.getSessionToken());
        System.out.println("Último Acesso: " + userSessionManager.getLastAccess());

        sleep(5000);
        userSessionManager.updateLastAccess();

        System.out.println("Token de Acesso: " + userSessionManager.getSessionToken());
        System.out.println("Último Acesso: " + userSessionManager.getLastAccess());

    }

}

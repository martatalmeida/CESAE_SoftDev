package Ex03;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class UserSessionManager {

    private int sessionToken;
    private String lastAccess;

    private static UserSessionManager instance;

    private UserSessionManager() {

        Random random = new Random();

        this.sessionToken = random.nextInt(0, 1000);
        this.lastAccess = String.valueOf(LocalTime.now());
    }

    public static UserSessionManager getInstance(){
        if (instance == null){
            instance = new UserSessionManager();
        }
        return instance;
    }

    public void updateLastAccess(){
        this.lastAccess = String.valueOf(LocalTime.now());
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }
}

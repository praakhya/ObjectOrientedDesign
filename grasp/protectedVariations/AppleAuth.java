package protectedVariations;

import java.util.Date;

public class AppleAuth implements Auth{
    private String authKey;
    public static final AppleAuth instance = new AppleAuth();
    private AppleAuth() {
        authKey="";
    }
    public String authenticate(String username, String password) {
        System.out.println("Authenticated with Apple");
        authKey = "AppleAuthKey:"+username+System.currentTimeMillis();;
        return authKey;
    }
    public boolean logout() {
        System.out.println("Logging out from Apple");
        if (authKey.isEmpty()) {
            return false;
        }
        authKey = "";
        return true;
    }
}

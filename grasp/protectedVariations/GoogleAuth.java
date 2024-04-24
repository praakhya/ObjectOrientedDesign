package protectedVariations;

import java.util.HashMap;
import java.util.Map;

public class GoogleAuth implements Auth{
    private Map<String,String> authDetails;
    public static final GoogleAuth instance = new GoogleAuth();
    private GoogleAuth() {
        authDetails = null;
    }
    public String authenticate(String username, String password) {
        authDetails = new HashMap<>();
        System.out.println("Authenticated with Google");
        authDetails.put("username",username);
        authDetails.put("password",password);
        authDetails.put("time",String.format("%d",System.currentTimeMillis()));
        return authDetails.toString();
    }
    public boolean logout() {
        System.out.println("Logging out from Google");
        if (authDetails.isEmpty()) {
            return false;
        }
        authDetails = null;
        return true;
    }
}

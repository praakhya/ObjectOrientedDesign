package protectedVariations;

public interface Auth {
    String authenticate(String username, String password);
    boolean logout();
}

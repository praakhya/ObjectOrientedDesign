package protectedVariations;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Auth authService = null;
        while (true) {
            if (authService == null){
                int ch;
                String username, password;
                System.out.println("1. Google Authentication\n2. Apple Authentication\n>>> ");
                ch = Integer.parseInt(scanner.nextLine());
                switch(ch) {
                    case 1:
                        authService = GoogleAuth.instance;
                        break;
                    case 2:
                        authService = AppleAuth.instance;
                        break;
                    default:
                        System.out.println("Authentication option not valid");
                        break;
                }
                System.out.print("Username: ");
                username = scanner.nextLine();
                System.out.print("Password: ");
                password = scanner.nextLine();
                if (authService!=null)
                    System.out.println(authService.authenticate(username,password));

            }
            else {
                System.out.print("Logout ? ");
                String ch;
                ch=scanner.nextLine();
                if (ch.equals("y")) {
                    boolean success = authService.logout();
                    if (success) {
                        break;
                    }
                    else {
                        System.out.println("Log out was unsuccessful");
                    }
                }
            }
        }
    }
}

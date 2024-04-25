import java.util.Scanner;

public class Main {
    private static DiscFactory discFactory = new DiscFactory();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        String discType, data, mediaType;
        System.out.println("CD, DVD, BluRay? ");
        discType = scanner.nextLine();
        Disc disc = discFactory.getInstance(discType);
        System.out.println("Enter data to be written");
        data= scanner.nextLine();
        System.out.println("Enter media type");
        mediaType = scanner.nextLine();
        disc.write(data,mediaType);
        disc.play();
    }
}
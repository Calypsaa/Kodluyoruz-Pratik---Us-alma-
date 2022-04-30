import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n, k;
        int total = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ussu alınacak sayı: ");
        n = scanner.nextInt();

        System.out.print("Us olacak sayı: ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {

            total *= n;
        }
        System.out.println("Sonuc: " + total);
    }
}

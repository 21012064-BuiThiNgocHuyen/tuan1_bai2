import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nhap mot so nguyen: ");
            int n = scanner.nextInt();
            
            if (n % 2 == 0) {
                System.out.println("So " + n + " la so chan.");
            } else {
                System.out.println("So " + n + " la so le.");
            }
            
            System.out.print("Ban co muon tiep tuc? (Y/N): ");
            String choice = scanner.next();
            
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }
        
        System.out.println("Ket thuc.");
        scanner.close();
    }
}

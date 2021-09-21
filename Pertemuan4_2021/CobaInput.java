import java.util.Scanner;

public class Cobainput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan nama Anda : ");
        String namaDepan = scanner.nextLine();

        System.out.println("Masukan umur Anda : ");
        int umur = scanner.nextInt();

        System.out.println("Nama Anda adalah " + namaDepan);
        System.out.println("Umur Anda adalah " + umur);
        
    }
    
}

import java.util.Scanner;

public class Predikat{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan ipk Anda = ");
        double ipk = scanner.nextDouble();

        System.out.print("Masukan lama masa studi = ");
        double lulusTahun = scanner.nextDouble();

        if (ipk >= 3.51 && lulusTahun <= 4){
            System.out.println("Predikat anda Summa Cumlaude");
        } else if (ipk >= 3.51){
            System.out.println("Predikat anda Cumlaude");
        } else if (ipk >= 3.01 && ipk < 3.51){
            System.out.println("Predikat anda Sangat Memuaskan");
        } else if (ipk >= 2.76 && ipk < 3.01){
            System.out.println("Predikat anda Memuaskan");
        } else if (ipk >= 2.00 && ipk < 2.76){
            System.out.println("Predikat anda Cukup");
        } else if (ipk < 2.00){
            System.out.println("Anda Tidak Lulus");
        }
        System.out.println("Anda Tidak/Lulus");

    }
} 
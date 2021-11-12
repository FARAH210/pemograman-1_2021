import java.util.Scanner;

public class Tugas8 {
    public static void main(String[] args) {
        String[] namaMahasiswa = new String[1000];
        double[] ipk = new double[1000];
        double jumlah, rerata;
        int i;

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("    Program Data Mahasiswa    ");
        System.out.println("------------------------------");
        System.out.println();

        jumlah = 0;
        for(i = 1; i <= 1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Data " + i);
            System.out.print("Masukkan Nama Mahasiswa ke-" + i + " = ");
            String cek1 = scan.nextLine();
            if (cek1.equals("exit")) {
                break;
            } else {
                namaMahasiswa[i] = cek1;
            }

            System.out.print("Masukkan IPK Mahasiswa ke-" + i + "  = ");
            double cek2 = scan.nextDouble();
            scan.nextLine();
            ipk[i] = cek2;

            System.out.println();
            jumlah += ipk[i];
        }

        System.out.println();
        System.out.println("+---------------------------------------+");
        System.out.println("|                                       |");
        System.out.println("|           DATA MAHASISWA UNY          |");
        System.out.println("|                                       |");
        System.out.println("+-------+-------------------------------+");
        System.out.println("|  No\t|  Nama Mahasiswa         IPK\t|");
        System.out.println("+-------+-------------------------------+");

        for(int j = 1; j < i; j++) {
            System.out.println("|   " + j + "\t|  " + namaMahasiswa[j] + "                 " + ipk[j] + "\t|");
        }

        System.out.println("+-------+-----------------------+-------+");
        rerata = jumlah/(i-1);
        System.out.println("| Rata-rata IPK                 |  " + rerata + "\t|");
        System.out.println("+-------------------------------+-------+");
        System.out.println();
    }
}
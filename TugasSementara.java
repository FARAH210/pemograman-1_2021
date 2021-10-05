import java.util.Scanner;

public class TugasSementara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println();
        System.out.println(".....::::::Program Siakad:::::.....");
        System.out.println();

        System.out.println("1. Tambah Data");
        System.out.println("2. Edit Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println();

        System.out.print("Menu yang anda pilih : ");
        int menu = scanner.nextInt();

        if (menu == 1) {
            System.out.println();
            System.out.println(":::Tambah Data:::");
            System.out.println();

            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mata Kuliah");
            System.out.println("3. Kembali");
            System.out.println();

            System.out.print("Menu yang anda pilih : ");
            int menu1 = scanner.nextInt();
            if (menu1 == 1) {
                Scanner scan = new Scanner (System.in);
                System.out.println();
                System.out.println("== Tambah Data Mahasiswa ==");
                System.out.println();

                System.out.println("Masukan nama mahasiswa : ");
                String namaMahasiswa =scan.nextLine();
                System.out.println("Mahasiswa yang anda tambah adalah " + namaMahasiswa);
            } else if (menu1 == 2) {
                Scanner scan = new Scanner (System.in);
                System.out.println();
                System.out.println("== Tambah Data Kuliah ==");
                System.out.println();

                System.out.println("Masukan nama mata kuliah : ");
                String namaMatakuliah = scan.nextLine();
                System.out.println("Mata kuliah yang anda tambah adalah " + namaMatakuliah);
            } else if (menu1 == 3) {
                System.out.println();
                System.out.println("===== Terima kasih =====");
            } else {
                System.out.println("Menu belum ada");
            }
        } else {
            System.out.println();
            System.out.println("Fitur belum tersedia");
            System.out.println();
            System.out.println("===== Terima kasih ====="); 
        } 
    }
}            

import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        System.out.println();
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=5) {
            menu = tampilanMenu();
            if (menu == 1) {
                siakad.melihatData();
            } else if (menu == 2) {
                siakad.menambahkanData();
            } else if (menu == 3) {
                siakad.mencariData();
            } else if (menu == 4) {
                siakad.ratarataIPK();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("           **========== Menu ==========**           ");
        System.out.println();
        System.out.println("1. Melihat Data");
        System.out.println("2. Menambahkan Data");
        System.out.println("3. Mencari Data");
        System.out.println("4. Rata-rata IPK");
        System.out.println("5. Keluar");
        System.out.println();
        System.out.print("   ....Silahkan pilih menu....    = ");
        int menu = scan.nextInt();
        return menu;
        
    }

    private void melihatData() {
        if (jumlahData == 0) {
            System.out.println("Data belum tersedia");
        } else {
            System.out.println("Berikut ini data mahasiswa yang ditambahkan");
            for (int i = 0; i < jumlahData; i++) {
                mahasiswa[i].getDetail();
            }
        }
        
    }

    private void menambahkanData() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan digit NIM mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukan nama lengkap mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukan IPK mahasiswa = ");
        double ipk = scan.nextDouble();
        System.out.print("Masukan Tinggi Badan mahasiswa = ");
        double tinggiBadan = scan.nextDouble();
        System.out.print("Masukan jumlah semester mahasiswa = ");
        int semester = scan.nextInt();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk, semester);
        inputMahasiswa.setTinggiBadan(tinggiBadan);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        melihatData();
    }

    public void mencariData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
    }

    public void ratarataIPK() {
        double total = 0.0;
        for(int i = 0; i < jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double ratarata = total / jumlahData;

        System.out.println("Ratarata IPK Mahasiswa = "+ ratarata);
    }
    
}


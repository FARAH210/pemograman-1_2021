import java.util,Scanner;
public class Siakad {
    private String[] nama = new String [1000];
    private String[] nim = new String [1000];
    private double[] ipk = new double [1000];
    private int jumlahData = 0;
        public static void main(String[] args) {
            System.out.println();
            Siakad siakad = new Siakad();
            int menu = 0; // deklarasi menu
            while (menu!=5) { //menampilkan menu
                menu = tampilanMenu(); 
                if (menu == 1) { // lihat data
                    siakad.lihatData();
                } else if (menu == 2) {
                    siakad.tambahData();
                } else if (menu == 3 ) {
                    siakad.ratarataIpk();
                }
            }
        }

        private static int tampilanMenu() {
            System.out.println();
            System.out.println("Selamat datang di Sistem Informasi Akademik Universitas Negeri Yogyakarta");
            System.out.println("Menu : ");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Rata-rata IPK");
            System.out.println("4. Edit Data");
            System.out.println("5. Keluar");
            System.out.print("Silahkan pilih menu = ");
            Scanner scanMenu = new Scanner (System.in);
            int menu = scanMenu.nextInt();
            return menu;
        }

        private void lihatData() {
            if (jumlahData == 0) {
                System.out.println();
                System.out.println("Data belum ter-input"); //dapat diubah
            } else {
                System.out.println();
                for (int i = 1; i < jumlahData; i++) {
                    System.out.println("Data mahasiswa " + i);
                    System.out.println("Nomor Induk Mahasiswa = " + nim[i]);
                    System.out.println("Nama Lengkap Mahasiswa = " + nama[i]);
                    System.out.println("IPK Mahasiswa = " + ipk[i]);
                    System.out.println();
                    ratarataIpk();
                    System.out.println();
                }
            }
        }

        private void tambahData() {
            Scanner tambah = new Scanner (System.in);
            System.out.println();
            System.out.print("Masukkan 11 digit NIM = ");
            nim[jumlahData] = tambah.nextLine();
            System.out.print("Masukkan nama lengkap mahasiswa = ");
            nama[jumlahData] = tambah.nextLine();
            System.out.print("Masukkan IPK mahasiswa dengan format dua angka dibelakang koma (contoh = 3.98) = ");
            ipk[jumlahData] = tambah.nextDouble();
            jumlahData++; // ngasih tau jumlah data naik terus
            lihatData();
        }
        
        public void ratarataIpk() {
            double totalIpk = 0.0;
            for (int i =0; i < jumlahData; i ++) {
                totalIpk += ipk[i];
            }
            double ratarata = totalIpk / jumlahData;

            System.out.println("Rata-rata IPK :" + ratarata);
        }
    }

    
}

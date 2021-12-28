import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        System.out.println();
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=9) {
            menu = tampilanMenu();
            if (menu == 1) {
                siakad.melihatData();
            } else if (menu == 2) {
                siakad.menambahkanData();
            } else if (menu == 3) {
                siakad.mencariDataByNIM();
            } else if (menu == 4) {
                siakad.mencariDataByNama();
            } else if (menu == 5) {
                siakad.mengeditNama();
            } else if (menu == 6) {
                siakad.mengeditNIM();
            } else if (menu == 7) {
                siakad.hapusData();
            } else if (menu == 8) {
                siakad.ratarataIPK();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("          ============= Menu =============          ");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Melihat Data");
        System.out.println("2. Menambahkan Data");
        System.out.println("3. Mencari DataByNIM");
        System.out.println("4. Mencari DataByNama");
        System.out.println("5. Mengedit Nama");
        System.out.println("6. Mengedit NIM");
        System.out.println("7. Hapus Data");
        System.out.println("8. Rata-rata IPK");
        System.out.println("9. Keluar");
        System.out.println();
        System.out.print("   ....Silahkan pilih menu....    = ");
        int menu = scan.nextInt();
        return menu;
        
    }

    private void melihatData() {
        if (jumlahData == 0) {
            System.out.println("Data belum tersedia");
        } else {
            System.out.println("Berikut ini data mahasiswa");
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
        double ipk = 0;
        double tinggiBadan = 0;
        double beratBadan = 0;
        try {
            System.out.print("Masukan IPK mahasiswa = ");
            ipk = scan.nextDouble();
            System.out.print("Masukan Tinggi Badan mahasiswa = ");
            tinggiBadan = scan.nextDouble();
            System.out.print("Masukan Berat Badan mahasiswa = ");
            beratBadan = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Anda harus memasukan bilangan desimal dengan menggunakan tanda titik. Silahkan edit IPK anda setelah input data");
        }
        scan.nextLine();
        System.out.print("Masukan jumlah semester mahasiswa = ");
        String semester = scan.nextLine();

        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk, semester);
        inputMahasiswa.setTinggiBadan(tinggiBadan);
        inputMahasiswa.setBeratBadan(beratBadan);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        melihatData();
    }

    public void mencariDataByNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index == -1) {
            System.out.println("NIM yang anda cari tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexByNIM(String nim) {
        for (int i = 0; i < jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }

    public void mencariDataByNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama Mahasiswa yang akan dicari = ");
        String nama = scan.nextLine();
        int index = getIndexByNama(nama);
        if (index == -1) {
            System.out.println("Nama yang anda cari tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexByNama(String nama) {
        for (int i = 0; i < jumlahData; i++) {
            if (mahasiswa[i].getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void mengeditNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index == -1) {
            System.out.println("NIM yang akan anda edit tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Nama baru mahasiswa yang diedit = ");
            String nama = scan.nextLine();
            mahasiswa[index].setNama(nama);
            mahasiswa[index].getDetail();
        }
    }

    public void mengeditNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nama yang akan diedit = ");
        String nama = scan.nextLine();
        int index = getIndexByNama(nama);
        if (index == -1) {
            System.out.println("Nama yang akan anda edit tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan NIM baru mahasiswa yang diedit = ");
            String nim = scan.nextLine();
            mahasiswa[index].setNIM(nim);
            mahasiswa[index].getDetail();
        }
    }

    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("Data yang anda akan hapus tidak ditemukan");
        } else {
            for (int i = index; i < jumlahData; i++) {
                mahasiswa[i] = mahasiswa[i + 1];
            }
            jumlahData--;
            melihatData();
        }
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


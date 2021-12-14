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
                siakad.editNama();
            } else if (menu == 5) {
                siakad.hapusData();
            } else if (menu == 6) {
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
        System.out.println("4. Edit Data");
        System.out.println("5. Hapus Data");
        System.out.println("6. Rata-rata IPK");
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
        double ipk = 0;
        double tinggi = 0;
        try {
            System.out.print("Masukan IPK mahasiswa = ");
            ipk = scan.nextDouble();
            System.out.print("Masukan Tinggi Badan mahasiswa = ");
            tinggiBadan = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Anda harus memasukan bilangan desimal dengan menggunakan tanda titik. Silahkan edit IPK atau tinggi anda setelah input data");
        }
        System.out.print("Masukan jumlah semester mahasiswa = ");
        int semester = scan.nextInt();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk, semester);
        inputMahasiswa.setTinggiBadan(tinggiBadan);
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

    public void editNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nama yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index == -1) {
            System.out.println("NIM yang akan anda edit tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan nama baru mahasiswa yang diedit = ");
            String nama = scan.nextLine();
            mahasiswa[index].setNama(nama);
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


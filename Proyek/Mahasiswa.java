public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;
    private int semester;

    public Mahasiswa(String nim, String nama, double ipk, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return this.semester;
    }

    public void getDetail() {
        System.out.printf("%7s %15s %10s %9s %9s %9s", this.nim, this.nama.toUpperCase(), String.valueOf(this.ipk), String.valueOf(this.tinggiBadan), String.valueOf(this.beratBadan), this.semester);
        System.out.println();
    }

    public void getHeader() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%7s %15s %10s %9s %9s %9s", "NIM", "NAMA", "IPK", "TINGGI BADAN", "BERAT BADAN", "SEMESTER");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
    }

}


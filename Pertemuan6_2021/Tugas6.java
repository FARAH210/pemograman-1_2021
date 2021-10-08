import java.util.Scanner;

public class Tugas6 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan maksimal yang akan ditampilkan = ");
        int n = scan.nextInt();
        int i = 0;
        int count = 0;
        while (i != n) {
            if(i == Math.pow(5,count)) {
                System.out.println(i);
                count++;
            }
            i++;

        }
    }
}

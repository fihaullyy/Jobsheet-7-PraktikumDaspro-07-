import java.util.Scanner;
public class siAkadFor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, minimal = 60, tertinggi = 0, terendah = 100;
        int lulus = 0, tdklulus = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= minimal) {
                lulus += 1;
            } else {
                tdklulus += 1;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Total Lulus: " + lulus);
        System.out.println("Total Tidak Lulus: " + tdklulus);
        sc.close();
    } 
}
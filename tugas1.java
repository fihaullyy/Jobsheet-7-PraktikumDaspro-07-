import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int tiket, totTiket = 0, hargaTiket = 50000;
    double totalHarga = 0, diskon, harga;

    do {
        System.out.print("Masukkan jumlah Tiket (ketik '0' untuk keluar): ");
        tiket = sc.nextInt();
        if (tiket == 0) {
            System.out.println("Penjualan hari ini selesai.");
            break;
        } else if (tiket > 0 && tiket <= 4) {
            totTiket += tiket;
            totalHarga += hargaTiket * tiket;
        } else if (tiket > 0 && tiket > 4 && tiket <= 10) {
            diskon = 0.1;
            totTiket += tiket;
            harga = (hargaTiket - (hargaTiket * diskon)) * tiket;
            totalHarga += harga;
        } else if (tiket > 0 && tiket > 10) {
            diskon = 0.15;
            totTiket += tiket;
            harga = (hargaTiket - (hargaTiket * diskon)) * tiket;
            totalHarga += harga;
        } else {
            System.out.println("Nilai tidak valid. Masukkan nilai yang valid");
            continue;  
        }     
    } while (true);
    System.out.println("Total Tiket Hari Ini : " + totTiket);
    System.out.println("Total harga penjualan hari ini : " + totalHarga);
    sc.close();
    }
}
import java.util.Scanner;

public class tugass1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int tiket, totTiket = 0, hargaTiket = 50000;
    double totalHarga = 0, diskon, harga;

    do {
        System.out.print("Masukkan jumlah Tiket (ketik '0' untuk keluar): ");
        tiket = sc.nextInt();
        if (tiket > 0 && tiket <= 4) {
            totTiket += tiket;
        } else if (tiket > 0 && tiket > 4) {
            diskon = 0.1;
            totTiket += tiket;
            harga = hargaTiket - (hargaTiket * diskon);
            totalHarga += harga;
        } else if (tiket > 0 && tiket > 10) {
            diskon = 0.15;
            totTiket += tiket;
            harga = hargaTiket - (hargaTiket * diskon);
            totalHarga += harga;
        } else if (tiket < 0) {
                System.out.println("Nilai tidak valid. Masukkan nilai yang valid");
                continue;
        } else {
            System.out.println("Selesai.");
            break;   
        }        
        
    } while (true);
    System.out.println("Total Tiket : " + totTiket);
    System.out.println("Total harga penjualan hari ini : " + totalHarga);
    }
    
}
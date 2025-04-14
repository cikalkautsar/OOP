package com.cikalstudio.uts_ganjil;
import java.util.Scanner;
public class no3 {
    
    // Metode untuk menghitung jumlah digit
    public static int sumDigits(long n) {
        int sum = 0;


        while (n != 0) {
            sum += n % 10;  // Ambil digit terakhir dan tambahkan ke total
            n /= 10;        // Hapus digit terakhir
        }

        return sum;
    }

    // Program utama untuk pengujian
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        long angka = input.nextLong();

        int hasil = sumDigits(angka);

        System.out.println("Jumlah semua digit adalah: " + hasil);
        
        input.close(); // Tutup scanner
    }
}

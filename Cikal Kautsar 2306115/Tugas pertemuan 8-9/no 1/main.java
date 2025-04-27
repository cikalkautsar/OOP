
package com.cikalstudio.tugas8_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan sisi1 segitiga: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi2 segitiga: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi3 segitiga: ");
        double sisi3 = input.nextDouble();
        input.nextLine(); // Mengonsumsi newline yang tersisa

        System.out.print("Masukkan warna segitiga: ");
        String warna = input.nextLine();

        System.out.print("Apakah segitiga terisi? (true/false): ");
        boolean terisi = input.nextBoolean();

        // Validasi sisi segitiga (menguji ketidaksetaraan segitiga)
        if (isValidTriangle(sisi1, sisi2, sisi3)) {
            // Membuat objek Segitiga
            Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3, warna, terisi);

            // Menampilkan hasil
            System.out.println("\nDeskripsi Segitiga:");
            System.out.println(segitiga.toString());
            System.out.println("Luas segitiga: " + segitiga.getArea());
            System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        } else {
            System.out.println("Segitiga tidak valid! Sisi-sisi yang dimasukkan tidak membentuk segitiga.");
        }
    }

    // Metode untuk memvalidasi apakah sisi-sisi membentuk segitiga yang valid
    public static boolean isValidTriangle(double sisi1, double sisi2, double sisi3) {
        return (sisi1 + sisi2 > sisi3) && (sisi1 + sisi3 > sisi2) && (sisi2 + sisi3 > sisi1);
    }
}

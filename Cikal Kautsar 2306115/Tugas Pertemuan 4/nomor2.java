
/*
 Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana
jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama
maka tampilkan bukan kubus.
 */
package com.cikalstudio.tugas4;
import java.util.Scanner;

public class Tugas4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi1 = 0, sisi2 = 0, sisi3 = 0;
        boolean kubus = true;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan sisi ke-" + i + ": ");
            int sisi = input.nextInt();

            // Simpan nilai ke variabel yang sesuai
            if (i == 1) {
                sisi1 = sisi;
            } else if (i == 2) {
                sisi2 = sisi;
            } else {
                sisi3 = sisi;
            }
        }

        // Cek apakah semua sisi sama
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}

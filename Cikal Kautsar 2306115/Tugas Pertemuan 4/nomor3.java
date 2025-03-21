/*
Buatlah algoritma dalam bahasa Java, yang membaca panjang (integer) tiga buah sisi
sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <= c, lalu menentukan apakah
ketiga sisi tersebut membentuk segitiga siku – siku, segitiga lancip, atau segitiga
tumpul (Petunjuk gunakan hukum Phytagoras).
*/

package com.cikalstudio.tugas4;
import java.util.Scanner;

public class Tugas4c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        boolean valid;

        do {
            valid = true;
            System.out.print("Masukkan sisi ke-1: ");
            a = scanner.nextInt();
            System.out.print("Masukkan sisi ke-2: ");
            b = scanner.nextInt();
            System.out.print("Masukkan sisi ke-3: ");
            c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Sisi harus lebih dari 0! Coba lagi!");
                valid = false;
            } else if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Ketiga sisi tidak bisa membentuk segitiga! Coba lagi!");
                valid = false;
            }
        } while (!valid);

        if (a * a + b * b == c * c) {
            System.out.println("Ini Segitiga Siku-siku");
        } else if (a * a + b * b > c * c) {
            System.out.println("Ini Segitiga Lancip");
        } else {
            System.out.println("Ini Segitiga Tumpul");
        }
    }
}

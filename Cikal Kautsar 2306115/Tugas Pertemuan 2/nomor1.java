package com.cikalstudio.tugas2;

/* 1) Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan  \
bilangan bulat negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan! 
 */
import java.util.Scanner;

public class Tugas2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga bilangan bulat negatif (pisahkan dengan spasi): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int tambah = a + b + c;
        int pengurangan = a - b - c;
        int kali = a * b * c;
        double bagi = (double) a / b / c;

        System.out.println("Hasil:\n" +
                "Penjumlahan: " + tambah + "\n" +
                "Pengurangan: " + pengurangan + "\n" +
                "Perkalian: " + kali + "\n" +
                "Pembagian: " + bagi);

        input.close();
    }
}

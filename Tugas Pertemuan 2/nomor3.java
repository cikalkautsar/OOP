package com.cikalstudio.tugas2;

/*3) Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘4’ dan  karakter ‘6’! 
 */
public class Tugas2c {
    public static void main(String[] args) {
        char char1 = '4';
        char char2 = '6';

        int sumAscii = (int) char1 + (int) char2;

        System.out.println("Jumlah kode ASCII dari '4' dan '6': " + sumAscii);
    }
}

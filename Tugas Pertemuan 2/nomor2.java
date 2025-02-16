/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cikalstudio.tugas2;

/*2) Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli migacoan jika  mempunyai uang lebih besar dari 10000 
(rupiah) dan pasangan Anda sedang tidak ad a  kelas di kuliahanya, yang dapat ditulis sebagai 
ekspresi: (uang > 10000) &&  (!tidakAdaKelasKuliah) 
 */
import java.util.Scanner;

import java.util.Scanner;

public class Tugas2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa emang uang kamu? ");
        int uang = input.nextInt();

        System.out.print("Pacar km emg gada kelas? (true kalau gak ada, false kalau ada): ");
        boolean tidakAdaKelasKuliah = input.nextBoolean();

        boolean bisaBeliMigacoan = (uang > 10000) && !tidakAdaKelasKuliah;

        System.out.println("Jadi bisa ga nih? (true kalau bisa, false kalau gabisa) " + bisaBeliMigacoan);

    }
}

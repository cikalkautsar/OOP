/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cikalstudio.uts_ganjil;
import java.util.Random;
/**
 *
 * @author cikal
 */
public class no1 {

    public static void main(String[] args) {
        Random rand = new Random ();
        int angkaBulan = rand.nextInt(12) + 1;
        
        System.out.println("Angka bulan : " + angkaBulan);
        System.out.println("Nama bulan");
        
        switch (angkaBulan) {
            case 1: 
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;
            default:
                System.out.println("Tidak diketahui");
        }
    }
}
        


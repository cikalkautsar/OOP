
package com.cikalstudio.uts_ganjil;
import java.util.Scanner;
public class no2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positif = 0;
        int negatif = 0;
        int jumlahData = 0;
        double total = 0;
        

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");
        int nilai = input.nextInt();
        

        while (nilai != 0) {
            if (nilai > 0) {
                positif++; // Menambahkan jumlah bilangan positif
            } else {
                negatif++; // Menambahkan jumlah bilangan negatif
            }
            
            total += nilai;  // Menambahkan nilai ke total
            jumlahData++;     // Menghitung jumlah data yang dimasukkan
            
            // Input nilai berikutnya
            nilai = input.nextInt();
        }
        
        // Jika ada data yang dimasukkan selain 0
        if (jumlahData > 0) {
            double rataRata = total / jumlahData;  // Menghitung rata-rata
            
            // Menampilkan hasil
            System.out.println("Jumlah bilangan positif adalah " + positif);
            System.out.println("Jumlah bilangan negatif adalah " + negatif);
            System.out.println("Nilai total adalah " + total);
            System.out.println("Nilai rata-rata adalah " + rataRata);
        } else {
            System.out.println("Tidak ada data yang dimasukkan selain 0.");
        }
        
    }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cikalstudio.tugas7;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nilai a: ");
        int a = input.nextInt();
        
        System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();
        
        System.out.println("Masukkan nilai c: ");
        int c = input.nextInt();
        
        System.out.println("Masukkan nilai d: ");
        int d = input.nextInt();
        
        System.out.println("Masukkan nilai e: ");
        int e = input.nextInt();
        
        System.out.println("Masukkan nilai f: ");
        int f = input.nextInt();
        
        //membuat objeknya hrs setelah inputan kalau ada inputan biar ke baca karena dalam pembuatan apapun harus ada dlu bahannya
        LinearEquations persamaanlinear = new LinearEquations(a, b, c, d, e, f);
        

        // Mengecek apakah ada solusi
        if (persamaanlinear.canSolve()) {
            System.out.println("Solusi:");
            System.out.println("x = " + persamaanlinear.getX());
            System.out.println("y = " + persamaanlinear.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}

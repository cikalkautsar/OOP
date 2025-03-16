package com.cikalstudio.tugas6;
//ini mesin
public class Main {

    public static void main(String[] args) {
        //Segitiga 1 itu yang constructor default jadi nilainya 1
        Segitiga segitiga1 = new Segitiga();
        
        //Segitiga 2 pake constructor yang ada parameternya
        Segitiga segitiga2 = new Segitiga(30,10,90);
        
        //Segitiga 3 pake setter jadi secara konsep pake constructor default
        Segitiga segitiga3 = new Segitiga();
        segitiga3.setAlas (20);
        segitiga3.setTinggi (30);
        segitiga3.setSisi (60);
        
        System.out.println("Luas Segitiga 1 : " + segitiga1.getLuas());
        System.out.println("Keliling Segitiga 1 : " + segitiga1.getKeliling());
        
        System.out.println("Luas Segitiga 2 : " + segitiga2.getLuas());
        System.out.println("Keliling Segitiga 2 : " + segitiga2.getKeliling());
        
        System.out.println("Luas Segitiga 3 : " + segitiga3.getLuas());
        System.out.println("Keliling Segitiga 3 : " + segitiga3.getKeliling());
    }
}

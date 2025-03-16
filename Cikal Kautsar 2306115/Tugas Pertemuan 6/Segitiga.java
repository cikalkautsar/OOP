package com.cikalstudio.tugas6;

public class Segitiga {
    double alas;
    double tinggi;
    double sisi;

    // Constructor tanpa parameter (default)
    public Segitiga() {
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }

    // Constructor dengan parameter
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
    //method hitung luas
    public double getLuas (){
        return 0.5 * alas * tinggi;
    }
    //method hitung keliling
    public double getKeliling() {
        return alas + tinggi + sisi;
    }
    //Setter alas
    public void setAlas (double alas) {
        this.alas = alas;
    }
    //Setter tinggi
    public void setTinggi (double tinggi) {
        this.tinggi = tinggi;
    }
    //Setter sisi
    public void setSisi (double sisi) {
        this.sisi = sisi;
    }
}


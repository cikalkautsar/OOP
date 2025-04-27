
package com.cikalstudio.tugas8_9;

// Superclass
public class Geometris {
    private String warna;
    private boolean terisi;
    
    // Konstruktor default
    public Geometris() {
        this.warna = "putih";
        this.terisi = false;
    }
    
    // Konstruktor dengan parameter
    public Geometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }
    
    // Metode getter
    public String getWarna() {
        return warna;
    }
    
    public boolean isTerisi() {
        return terisi;
    }
    
    // Metode toString
    @Override
    public String toString() {
        return "Warna: " + warna + ", Terisi: " + isTerisi();
    }
}

// Kelas Segitiga (Subclass dari Geometris)
class Segitiga extends Geometris {
    private double side1;
    private double side2;
    private double side3;

    // Konstruktor default
    public Segitiga() {
        super(); // Memanggil konstruktor default kelas Geometris
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Konstruktor dengan parameter
    public Segitiga(double side1, double side2, double side3, String warna, boolean terisi) {
        super(warna, terisi); // Memanggil konstruktor kelas Geometris dengan parameter
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Metode pengakses untuk sisi
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Menghitung luas segitiga
    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Rumus Heron
    }

    // Menghitung keliling segitiga
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Metode toString untuk deskripsi segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + ", sisi2 = " + side2 + ", sisi3 = " + side3 + ", " + super.toString();
    }
}

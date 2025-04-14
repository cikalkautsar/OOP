package com.cikalstudio.uts_ganjil;

import java.text.DecimalFormat;

class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

    public LimasSegiEmpat(double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    public double getVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public double getLuasAlas() {
        return luasAlas;
    }

    public double getLuasSelubung() {
        return luasSelubungLimas;
    }

    public double getTinggi() {
        return tinggi;
    }
}

public class no4a {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        LimasSegiEmpat limas1 = new LimasSegiEmpat(1, 1, 1);
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        tampilkanInfo(limas1);
        tampilkanInfo(limas2);
        tampilkanInfo(limas3);
    }

    public static void tampilkanInfo(LimasSegiEmpat limas) {
        System.out.println("Limas segi empat dengan luas alas : " + limas.getLuasAlas()
                + ", luas selubung limas : " + limas.getLuasSelubung()
                + " dan tinggi : " + limas.getTinggi()
                + ". Luasnya : " + limas.getLuas()
                + ", sedangkan volumenya : " + limas.getVolume());
    }
}


package com.cikalstudio.tugas7;

public class LinearEquations {
    //enkapisulasi biar datanya gabisa di ubah sembarangan
    private int a,b,c,d,e,f;
    
    //set nilai default dengan constructor tanpa parameter
    public LinearEquations() {
        this.a = 0 ;
        this.b = 0 ;
        this.c = 0 ;
        this.d = 0 ;
        this.e = 0 ;
        this.f = 0 ;
    
    }
    
    public LinearEquations(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
   }
    
    //getter supaya enkapsulasi bisa di akses dari luar
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public int getD() {
        return d;
    }
    public int getE() {
        return e;
    }
    public int getF() {
        return f;
    }
    
    //method buat check persamaan bisa di selesaikan apa ga
    public boolean canSolve () {
        return (a*d - b*c) != 0;
    }
    
    //method buat hitung nilai x
    public int getX () {
        return (e*d - b*f ) / (a*d - b*c);
    }
    
    public int getY() {
        return (a*f - e*c) / (a*d - b*c);
    }
}



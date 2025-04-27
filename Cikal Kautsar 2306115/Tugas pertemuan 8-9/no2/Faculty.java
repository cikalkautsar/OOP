/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cikalstudio.tugas8_9;

// Kelas Faculty (subclass dari Employee)
public class Faculty extends Employee {
    private int workHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, int workHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.workHours = workHours;
        this.rank = rank;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getRank() {
        return rank;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Faculty: " + getName() + ", Rank: " + rank + ", Work Hours: " + workHours + ", " + super.toString();
    }
}

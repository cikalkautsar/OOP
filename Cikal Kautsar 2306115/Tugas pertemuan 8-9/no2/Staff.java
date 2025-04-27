/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cikalstudio.tugas8_9;

// Kelas Staff (subclass dari Employee)
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Staff: " + getName() + ", Title: " + title + ", " + super.toString();
    }
}

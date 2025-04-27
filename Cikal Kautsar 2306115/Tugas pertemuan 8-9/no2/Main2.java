/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.cikalstudio.tugas8_9;

public class Main2 {
    public static void main(String[] args) {
        // Membuat objek MyDate untuk tanggal
        MyDate hireDate = new MyDate(15, 3, 2020);

        // Membuat objek Person
        Person person = new Person("Mavin Agrapraja", "123 Main St", "555-1234", "mavinmuffin@ntu.edu");
        
        // Membuat objek Student
        Student student = new Student("Cikal Kautsar", "456 Oak St", "555-5678", "cikalkautsar@upi.edu", Student.FRESHMAN);
        
        // Membuat objek Employee
        Employee employee = new Employee("Ali Zainal", "789 Pine St", "555-8765", "ali@example.com", "Room 101", 50000, hireDate);
        
        // Membuat objek Faculty
        Faculty faculty = new Faculty("Dr. Gerry", "101 Maple St", "555-4321", "Gerry@example.com", "Room 202", 70000, hireDate, 40, "Professor");
        
        // Membuat objek Staff
        Staff staff = new Staff("Leon  S Kennedy", "202 Birch St", "555-8765", "leod@example.com", "Room 303", 40000, hireDate, "Administrative Assistant");

        // Menampilkan hasil toString
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

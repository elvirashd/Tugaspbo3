/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */
public class Main {
public static void main(String[] args) {
        Administrator admin = new Administrator("Elvira", 101, 100000, "Direktur", "Employee Relations");
        Teacher teacher = new Teacher("Bintang", 202, 70000, "Mathematics", "Algebra");
        Staff staff = new Staff("Syalwa", 123, 500000, "Host live");
        Students student = new Students("Rini", 777, "Sistem Informasi");
        Alumnus alumnus = new Alumnus("Hafid", 505, "2024");

        System.out.println("Administrator Details:");
        admin.displayInfo();

        System.out.println("\nTeacher Details:");
        teacher.displayInfo();

        System.out.println("\nStaff Details:");
        staff.displayInfo();

        System.out.println("\nStudent Details:");
        student.displayInfo();

        System.out.println("\nAlumnus Details:");
        alumnus.displayInfo();
    }   
}

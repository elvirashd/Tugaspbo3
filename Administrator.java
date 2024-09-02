/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */
public class Administrator extends Faculty {
private String adminArea;

    public Administrator(String nama, int id, double gaji, String department, String adminArea) {
        super(nama, id, gaji, department);
        this.adminArea = adminArea;
    }

    public String getAdminArea() {
        return adminArea;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin Area: " + adminArea);
    }   
}

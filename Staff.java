/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */
public class Staff extends Employee {
private String jabatan;

    public Staff(String nama, int id, double gaji, String jabatan) {
        super(nama, id, gaji);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jabatan: " + jabatan);
    }
}

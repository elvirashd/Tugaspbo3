/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */

public class Employee extends CivitasAkademika{
private double gaji;

    public Employee(String nama, int id, double gaji) {
        super(nama, id);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("gaji: " + gaji);
    }
}


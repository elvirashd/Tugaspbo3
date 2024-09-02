/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */
public class Teacher extends Faculty{
private String MataPelajaran;

    public Teacher(String nama, int id, double gaji, String department, String MataPelajaran) {
        super(nama, id, gaji, department);
        this.MataPelajaran = MataPelajaran;
    }

    public String getSubject() {
        return MataPelajaran;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("MataPelajaran: " + MataPelajaran);
    }   
}

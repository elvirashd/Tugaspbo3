/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */
public class Alumnus extends CivitasAkademika{
private String tahunkelulusan;

    public Alumnus(String nama, int id, String tahunkelulusan) {
        super(nama, id);
        this.tahunkelulusan = tahunkelulusan;
    }

    public String getGraduationYear() {
        return tahunkelulusan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tahun kelulusan: " + tahunkelulusan);
    }   
}

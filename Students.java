/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */
public class Students extends CivitasAkademika {
private String jurusan;

    public Students(String nama, int id, String jurusan) {
        super(nama, id);
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jurusan: " + jurusan);
    }
    
}

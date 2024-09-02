/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvira solikha H.I (09040623057)
 */
class CivitasAkademika {
 private String nama;
 private int id;
 
 public CivitasAkademika(String nama, int id){
     this.nama = nama;
     this.id = id;
 }
 
 public String getNama(){
     return nama;
 }
 
 public int getId(){
     return id;
 }
 
 public void displayInfo(){
     System.out.println("Nama: " + nama);
     System.out.println("ID: " + id);
 }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materi_Inheritance;

/**
 *
 * @author Marsa Kristian
 */
public class super_class {
    
    //atribut super class
    String nama, keterangan;
            
    //constructor (alt + fn + insert)
            
    public super_class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    //getter

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public void cetak(){
        System.out.println
        (getNama() + " " + getKeterangan());
    }
        
    public void halo(){
        System.out.println("Halo");
    }
}

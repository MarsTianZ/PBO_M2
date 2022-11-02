/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism_M6_2;
import java.util.Scanner;
import java.io.IOException;


/**
 *
 * @author Marsa Kristian
 */
public class NilaiMK {
    private String nim, nama;

    public NilaiMK(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    //fungsi berparameter
    public int hitungnilai(int uts, int uas, int tugas) throws IOException{
        return ((uts * 30/100) * (uas * 30/100) * (tugas * 40/100));
    }
    
    //Overloading method
    //inputan user
    void getData()throws IOException{
        Scanner input =  new Scanner(System.in);
        
        //input
        System.out.print("NIM : ");
        nim = input.nextLine();
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.println("Ini adalah method" + " getData tanpa parameter : " + nim + ", " + nama);
    }
    
    void getData(String namaDosen){
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nama Dosen Wali : "+namaDosen);
        System.out.println("Ini adalah method dengan parameter");
    }
}

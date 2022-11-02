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
public class NilaiPBO extends NilaiMK {
    Scanner input1 =  new Scanner(System.in);
    public NilaiPBO(String nim, String nama) {
        super(nim, nama);
    }

    @Override
    public int hitungnilai(int uts, int uas, int tugas) throws IOException{
        System.out.println("Masukkan Nilai : ");
        System.out.print("Nilai UTS : ");
        uts = input1.nextInt();
        System.out.print("Nilai UAS : ");
        uas = input1.nextInt();
        System.out.print("Nilai Tugas : ");
        tugas = input1.nextInt();
        return ((uts*25/100)+(uas*25/100)+(tugas*50/100)); 
    }
}

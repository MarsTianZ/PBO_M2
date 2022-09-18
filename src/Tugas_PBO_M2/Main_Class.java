/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_PBO_M2;
import java.util.Scanner;
/**
 *
 * @author Marsa Kristian
 */
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // scanner section
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        
        Undika stikom = new Undika("","");
        Mahasiswa mahasiswa1 = new Mahasiswa("","",0,0,0,0,"","");
        Karyawan karyawan1 = new Karyawan("","",0,0,0,"","");
        
        do {
            System.out.println("========== Marsa Kristian/21410100021 =========");       
            System.out.println("||  Pengecekan SPP dan Gaji Karyawan Undika  ||");
            System.out.println("||  1: Cek SPP Mahasiswa                     ||");
            System.out.println("||  2: Cek Gaji Karyawan                     ||");
            System.out.println("||  0: Keluar Aplikasi                       ||");
            System.out.println("===============================================");
            System.out.print("  Silahkan Tentukan Pilihan Menu : ");
            System.out.println("");
            int pilih = input1.nextInt();
            switch(pilih){
                    case 1: //Menu 1: Cek SPP Mahasiswa
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.print("Input Nama Mahasiswa : ");
                        stikom.setNama(input.nextLine());
                        System.out.print("Input NIM : ");
                        mahasiswa1.setNIM(input.nextLine());
                        System.out.print("Input Prodi : ");
                        mahasiswa1.setProdi(input.nextLine());
                        System.out.print("Input Angkatan : ");
                        mahasiswa1.setAngkatan(input1.nextInt());
                        System.out.print("Input Semester : ");
                        mahasiswa1.setSemester(input1.nextInt());
                        System.out.print("Input Alamat : ");
                        stikom.setalamat(input.nextLine());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("");
                        System.out.println("");
                        
                        System.out.println("===================================================================");
                        System.out.println(" o Nama : "+ stikom.getNama());
                        System.out.println(" o NIM : "+ mahasiswa1.getNIM());
                        System.out.println(" o Prodi : "+ mahasiswa1.getProdi());
                        System.out.println(" o Alamat : " + stikom.getalamat());
                        System.out.println(" o Angkatan : " + mahasiswa1.getAngkatan());
                        System.out.println(" o Semester: " + mahasiswa1.getSemester());
                        System.out.println(" o SPP : " + mahasiswa1.getSpp());
                        System.out.println(" o Bayar SPP Sebesar : " + mahasiswa1.getBayar_spp_semester());
                        System.out.println("===================================================================");
                    break;
                    
                    case 2: //Menu 2: Cek Gaji Karyawan
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.print("Input Nama : ");
                        stikom.setNama(input.nextLine());
                        System.out.print("Input NIK : ");
                        karyawan1.setNIK(input.nextLine());
                        System.out.print("Input Alamat : ");
                        stikom.setalamat(input.nextLine());
                        System.out.print("Input Bagian : ");
                        karyawan1.setBagian(input.nextLine());
                        System.out.print("Input Kehadiran : ");
                        karyawan1.setKehadiran(input1.nextInt());
                        System.out.print("Input Gaji/hari : ");
                        karyawan1.setGaji_per_hari(input1.nextInt());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("");
                        System.out.println("");

                        System.out.println("========================================================");
                        System.out.println(" o Nama : " + stikom.getNama());
                        System.out.println(" o NIK : " + karyawan1.getNIK());
                        System.out.println(" o Alamat : " + stikom.getalamat());
                        System.out.println(" o Bagian : " + karyawan1.getBagian());
                        System.out.println(" o Kehadiran : " + karyawan1.getKehadiran());
                        System.out.println(" o Gaji/hari : " + karyawan1.getGaji_per_hari());
                        System.out.println(" o Total Gaji : " + karyawan1.getTotalGaji());
                        System.out.println("========================================================");
                    break;
                    
                    case 3:
                        System.exit(0);
                    break;
                }
        }while(true);
    }
}
        
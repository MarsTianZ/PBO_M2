/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO_M2;
/**
 *
 * @author Marsa Kristian
 */
public class Karyawan extends Undika{
    String NIK;
    String bagian;
    int kehadiran;
    int gaji_per_hari;
    int totalGaji;

    public Karyawan(String NIK, String bagian, int kehadiran, int gaji_per_hari, int totalGaji, String Nama, String Alamat) {
        super(Nama, Alamat);
        this.NIK = NIK;
        this.bagian = bagian;
        this.kehadiran = kehadiran;
        this.gaji_per_hari = gaji_per_hari;
        this.totalGaji = totalGaji;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getGaji_per_hari() {
        return gaji_per_hari;
    }

    public void setGaji_per_hari(int gaji_per_hari) {
        this.gaji_per_hari = gaji_per_hari;
    }

    public int getTotalGaji() {
        return totalGaji = kehadiran*gaji_per_hari;
        
    }       
}

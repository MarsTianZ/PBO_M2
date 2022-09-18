/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO_M2;
/**
 *
 * @author Marsa Kristian
 */
class Mahasiswa extends Undika{
    String NIM;
    String prodi;
    int spp;
    int angkatan;
    int semester;
    int bayar_spp_semester;

    public Mahasiswa(String NIM, String prodi, int spp, int angkatan, int semester, int bayar_spp_semester, String Nama, String Alamat) {
        super(Nama, Alamat);
        this.NIM = NIM;
        this.prodi = prodi;
        this.spp = spp;
        this.angkatan = angkatan;
        this.semester = semester;
        this.bayar_spp_semester = bayar_spp_semester;
    }


    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getSpp() {
        if (angkatan > 17){
            spp = 15000000;
        } else {
            spp = 12000000;
        }
        return this.spp;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getBayar_spp_semester() {
        bayar_spp_semester = spp*semester;
        return bayar_spp_semester;
    }

    public void setBayar_spp_semester(int bayar_spp_semester) {
        this.bayar_spp_semester = bayar_spp_semester;
    }
        
        
}

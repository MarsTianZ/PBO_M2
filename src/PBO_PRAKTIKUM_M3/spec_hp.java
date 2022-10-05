/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_PRAKTIKUM_M3;

/**
 *
 * @author Marsa Kristian
 */
public class spec_hp {
    String nama, merk, os, chipset;
    int ram, rom;
    
    public spec_hp(String nama, String merk, String os, String chipset, int ram, int rom) {
        this.nama = nama;
        this.merk = merk;
        this.os = os;
        this.chipset = chipset;
        this.ram = ram;
        this.rom = rom;
    }
    
    void show(){
        System.out.println("Nama Merk hp : "+this.nama);
        System.out.println("Nama Tipe HP : "+this.merk);
        System.out.println("OS           : "+this.os);
        System.out.println("Chipset      : "+this.chipset);
        System.out.println("RAM          : "+this.ram+" GB");
        System.out.println("ROM          : "+this.rom+" GB");
    }     
    /*
    public String getNama() {
        return nama;
    }

    public String getMerk() {
        return merk;
    }

    public String getOs() {
        return os;
    }

    public String getChipset() {
        return chipset;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }
    */
}

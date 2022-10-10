/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M5;
import java.util.*;
/**
 *
 * @author Marsa Kristian
 */
public class Lion_Air extends Tiket {
    
    //Atribut subclass:
    private int jmlhPenumpang, harga, total;
    private String kotaTujuan, nmrPesawat, nmrKursi;
        
    
    //constructor
    public Lion_Air(int jmlhPenumpang, int harga, int total, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        super(bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jmlhPenumpang = jmlhPenumpang;
        this.harga = harga;
        this.total = total;
        this.kotaTujuan = kotaTujuan;
        this.nmrPesawat = nmrPesawat;
        this.nmrKursi = nmrKursi;
    }

    public int getJmlhPenumpang() {
        return jmlhPenumpang;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNmrPesawat() {
        return nmrPesawat;
    }

    public String getNmrKursi() {
        return nmrKursi;
    }

    public int getHarga() {
        if (kotaAsal.equalsIgnoreCase("Surabaya")) {
            if (kotaTujuan.equalsIgnoreCase("Bali") && kotaTujuan.equalsIgnoreCase("Lombok")) {
                this.harga = 500000;
            } else if (kotaTujuan.equalsIgnoreCase("Jakarta") && kotaTujuan.equalsIgnoreCase("Yogyakarta")) {
                this.harga = 600000;
            } else if (kotaTujuan.equalsIgnoreCase("Balikpapan") && kotaTujuan.equalsIgnoreCase("Makassar")) {
                this.harga = 700000;
            } else {
                System.out.println("error");
            }
        } else if (kotaAsal.equalsIgnoreCase("Jakarta")) {
            if (kotaTujuan.equalsIgnoreCase("Bali") && kotaTujuan.equalsIgnoreCase("Lombok")) {
                this.harga = 700000;
            } else if (kotaTujuan.equalsIgnoreCase("Surabaya") && kotaTujuan.equalsIgnoreCase("Yogyakarta")) {
                this.harga = 750000;
            } else if (kotaTujuan.equalsIgnoreCase("Balikpapan") && kotaTujuan.equalsIgnoreCase("Makassar")) {
                this.harga = 800000;
            } else {
                System.out.println("error");
            }
        } else {
            this.harga = 0;
        }
        return harga;
    }

    public int getTotal() {
        return this.getHarga()*this.getJmlhPenumpang();
    } 
    
}

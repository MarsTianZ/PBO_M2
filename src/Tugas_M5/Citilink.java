/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M5;

/**
 *
 * @author Marsa Kristian
 */
public class Citilink extends Tiket {
    
    //Atribut
    private int jmlhPenumpang, harga, total;
    private String kotaTujuan, nmrPesawat, nmrKursi;
    
    //Constructor
    public Citilink(int jumlahPenumpang, int harga, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        super(bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jmlhPenumpang = jmlhPenumpang;
        this.harga = harga;
        this.kotaTujuan = kotaTujuan;
        this.nmrPesawat = noPesawat;
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
                this.harga = 700000;
            } else if (kotaTujuan.equalsIgnoreCase("Jakarta") && kotaTujuan.equalsIgnoreCase("Yogyakarta")) {
                this.harga = 800000;
            } else if (kotaTujuan.equalsIgnoreCase("Balikpapan") && kotaTujuan.equalsIgnoreCase("Makassar")) {
                this.harga = 850000;
            } else {
                this.harga = 0;
            }
        } else if (kotaAsal.equalsIgnoreCase("Jakarta")) {
            if (kotaTujuan.equalsIgnoreCase("Bali") && kotaTujuan.equalsIgnoreCase("Lombok")) {
                this.harga = 1000000;
            } else if (kotaTujuan.equalsIgnoreCase("Surabaya") && kotaTujuan.equalsIgnoreCase("Yogyakarta")) {
                this.harga = 750000;
            } else if (kotaTujuan.equalsIgnoreCase("Balikpapan") && kotaTujuan.equalsIgnoreCase("Makassar")) {
                this.harga = 900000;
            } else {
                this.harga = 0;
            }
        } else {
            this.harga = 0;
        } 
        return harga;
    }

    public int getTotal() {
        this.total = getHarga() * this.jmlhPenumpang;
        return total;
    }
    
    
}

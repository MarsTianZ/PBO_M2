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

    public Citilink(int jmlhPenumpang, String kotaTujuan, String nmrPesawat, String nmrKursi, String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        super(bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jmlhPenumpang = jmlhPenumpang;
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
            if (getKotaAsal().equalsIgnoreCase("Surabaya")) {
            if (getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 700000;
            } else if (getKotaTujuan().equalsIgnoreCase("Jakarta") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 800000;
            } else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 850000;
            } else {
                this.harga = 0;
            }
        } else if (getKotaAsal().equalsIgnoreCase("Jakarta")) {
            if (getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 1000000;
            } else if (getKotaTujuan().equalsIgnoreCase("Surabaya") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 750000;
            } else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 900000;
            } else {
                this.harga = 0;
            }
        } 
        
        return harga;
    }

    public int getTotal() {
        this.total = getHarga() * this.jmlhPenumpang;
        return total;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNmrKursi(String nmrKursi) {
        this.nmrKursi = nmrKursi;
    }
    
    
}

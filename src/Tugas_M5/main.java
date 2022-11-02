/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_M5;
import java.util.Scanner;
/**
 *
 * @author Marsa Kristian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String tglKembali = "";
        String lagi, tkl = "";
        int total = 0;
        try {
            do {
            System.out.println("===== Selamat datang di Pembelian Tiket Pesawat =====");
            System.out.print("~ Jumlah Penumpang Pesawat = ");
            int jmlhPenumpang = input1.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("~ Kota Asal = ");
            String kotaAsal = input.nextLine();
            System.out.println("\n~ Rute = \n1. Balikpapan \n2. Surabaya \n3. Makassar \n4. Jakarta \n5. Bali \n6. Yogyakarta \n7. Lombok");
            System.out.print("~ Kota Tujuan = ");
            String kotaTujuan = input.nextLine();
            System.out.print("~ Tanggal Berangkat = ");
            String tglBerangkat = input.nextLine();
                System.out.print("Pesan pulang pergi (y/n) : ");
                String pp = input.nextLine();
                if (pp.equalsIgnoreCase("Y")) {
                    System.out.print("Tanggal Kembali: ");
                    tkl = input.nextLine();
                    }
                else if(pp.equalsIgnoreCase("N")){
                    tkl = "";
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n1. Lion Air \n2. Citilink");
            System.out.print("~ Pilihan Maskapai = ");
            int tipepesawat = input1.nextInt();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Lion_Air[] pesawat1 = new Lion_Air[jmlhPenumpang];
            Citilink[] pesawat2 = new Citilink[jmlhPenumpang];
            switch (tipepesawat) {
                case 1:
                    System.out.println("==LION AIR==");
                    for (int p=0; p<pesawat1.length; ++p) {
                        System.out.print("~ Booking ID = ");
                        String bookingID = input.nextLine();
                        System.out.print("~ NIK = ");
                        String nik = input.nextLine();
                        System.out.print("~ Nama = ");
                        String nama = input.nextLine();
                        System.out.print("~ Jenis kelamin  = ");
                        String jenis_kelamin = input.nextLine();
                        System.out.print("~ No pesawat = ");
                        String nmrPesawat = input.nextLine();
                        System.out.print("~ No kursi = ");
                        String nmrKursi = input.nextLine();
                        pesawat1[p] = new Lion_Air(jmlhPenumpang, kotaTujuan, nmrPesawat, nmrKursi, bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
                        System.out.println("");
                    }
                    for (int p=0; p<pesawat1.length; ++p) {
                        System.out.println("========================== Print Lion Air ==========================");
                        System.out.println("|| Booking ID        = " + pesawat1[p].getBookingID());             
                        System.out.println("|| NIK               = " + pesawat1[p].getNik());
                        System.out.println("|| Nama              = " + pesawat1[p].getNama());
                        System.out.println("|| Jenis Kelamin     = " + pesawat1[p].getJenis_kelamin());
                        System.out.println("|| Kota Asal         = " + pesawat1[p].getKotaAsal());
                        System.out.println("|| Kota Tujuan       = " + pesawat1[p].getKotaTujuan());
                        System.out.println("|| Tanggal berangkat = " + pesawat1[p].getTglBerangkat());
                        System.out.println("|| Tanggal kembali   = " + pesawat1[p].getTglKembali());
                        System.out.println("|| Nomor pesawat     = " + pesawat1[p].getNmrPesawat());
                        System.out.println("|| Nomor kursi       = " + pesawat1[p].getNmrKursi());
                        System.out.println("|| Harga tiket       = " + pesawat1[p].getHarga());
                        System.out.println("=====================================================================");
                        total = pesawat1[p].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total = " + total);
                    break;                       
                case 2:
                    System.out.println("==CITILINK==");
                    for (int p=0; p<pesawat2.length; ++p) {
                        System.out.print("~ Booking ID = ");
                        String bookingID = input.nextLine();
                        System.out.print("~ NIK = ");
                        String nik = input.nextLine();
                        System.out.print("~ Nama = ");
                        String nama = input.nextLine();
                        System.out.print("~ Jenis kelamin  = ");
                        String jenis_kelamin = input.nextLine();
                        System.out.print("~ No pesawat = ");
                        String nmrPesawat = input.nextLine();
                        System.out.print("~ No kursi = ");
                        String nmrKursi = input.nextLine();
                        pesawat2[p] = new Citilink(jmlhPenumpang, kotaTujuan, nmrPesawat, nmrKursi, bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
                        System.out.println("");
                    }
                    for (int p=0; p<pesawat2.length; ++p) {
                        System.out.println("========================== Print Citilink ==========================");
                        System.out.println("|| Booking ID        = " + pesawat2[p].getBookingID());             
                        System.out.println("|| NIK               = " + pesawat2[p].getNik());
                        System.out.println("|| Nama              = " + pesawat2[p].getNama());
                        System.out.println("|| Jenis Kelamin     = " + pesawat2[p].getJenis_kelamin());
                        System.out.println("|| Nomor pesawat     = " + pesawat2[p].getNmrPesawat());
                        System.out.println("|| Nomor kursi       = " + pesawat2[p].getNmrKursi());
                        System.out.println("|| Kota Asal         = " + pesawat2[p].getKotaAsal());
                        System.out.println("|| Kota Tujuan       = " + pesawat2[p].getKotaTujuan());
                        System.out.println("|| Tanggal berangkat = " + pesawat2[p].getTglBerangkat());
                        System.out.println("|| Tanggal kembali   = " + pesawat2[p].getTglKembali());
                        System.out.println("|| Nomor kursi       = " + pesawat2[p].getNmrKursi());
                        System.out.println("|| Harga tiket       = " + pesawat2[p].getHarga());
                        System.out.println("=====================================================================");
                        total = pesawat2[p].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("");
                    System.exit(0);
                    break;
                }
                System.out.print("\nPesan Lagi (Y/N): ");
                lagi = input.nextLine();
            }while(lagi.equalsIgnoreCase("y"));
        } catch (Exception e){
            System.out.println(e);
            }
    }
} 




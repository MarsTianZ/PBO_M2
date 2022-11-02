/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Marsa Kristian
 */
public class Minuman extends Barang {
    Scanner input =  new Scanner(System.in);
    Scanner input1 =  new Scanner(System.in);
    String jns;
    int jmlhBeli, total, disc;

    public Minuman() {
    }

  
    
    public Minuman(String kdBrg, String nmBrg, String jns, int hrgBrg, int stok) {
        super(kdBrg, nmBrg, hrgBrg, stok);
        this.jns = jns;
    }
    
    public Minuman(int jmlhBeli) {
        this.jmlhBeli = jmlhBeli;
    }
    
    public Minuman(String jns, int jmlhBeli, int total, int disc) {
        this.jns = jns;
        this.jmlhBeli = jmlhBeli;
        this.total = total;
        this.disc = disc;
    }

    public String getJns() {
        return jns;
    }

    public int total() {
        return this.total = super.getHrg() * this.jmlhBeli;
    }
    
    public int disc(){
        int a = 0;
        if (this.total() > 200000) {
            this.disc = this.total() * 10 / 100;
            a = this.total() - this.disc;
        }
        else {
            System.out.println("invalid");
        }
        return a;
    }

    @Override
    public int stokUpd() {
        int b = getStok();
        if (b <= 0) {
            System.out.println("barang tidak ada");
        }
        else if (b > 0) {
            b -= this.jmlhBeli;
            System.out.println("barang sisa = " + b);
        }
        return b;
    }

    @Override
    public void entriData() throws IOException {
        System.out.println("OUTPUT");
        System.out.println("~~~~~~~~~~~");
        System.out.print("Kode Minuman  =  ");
        String kd = input.nextLine();
        if (kd.equalsIgnoreCase(super.kdBrg)) {
            System.out.println("Nama Minuman = " + super.getNmBrg());
            System.out.println("Jenis Minuman = " + this.getJns());
            System.out.println("Harga = " + super.getHrg());
            System.out.println("Stok saat ini : " + super.getStok());
        }
        System.out.print("jumlah yang dibeli = ");
        this.jmlhBeli = input1.nextInt();
        Minuman p = new Minuman(this.jmlhBeli);
        this.stokUpd();
        System.out.println("TOTAL = " + this.total());
        if (this.total() > 200000) {
            System.out.println("Anda mendapat diskon sebesar 10%");
        }
        System.out.println("Cetak struk?");
        System.out.println("(Ya/Tidak)");
        String cetak = input.nextLine();
        if (cetak.equalsIgnoreCase("ya") || cetak.equalsIgnoreCase("y")) {
            this.invoice();
        }
        else {
            System.out.println("Invoice tidak tercetak");
            System.exit(0);
        }
        System.out.println("^_^");
        System.out.println("~~~~~~~~~~~");
    }

        @Override
    public void entriData(Barang p) throws IOException {
        System.out.println("=== Masukkan Minuman ===");
        System.out.print("Kode Barang = ");
        kdBrg = input.nextLine();
        System.out.print("Nama Barang = ");
        nmBrg = input.nextLine();
        System.out.print("Jenis Barang = ");
        jns = input.nextLine();
        System.out.print("Stok Barang = ");
        stok = input1.nextInt();
        System.out.print("Harga Barang = ");
        hrg = input1.nextInt();
        p = new Minuman(kdBrg, nmBrg, jns, stok, hrg);
        System.out.println("");
    }
    
    public void invoice() {
        System.out.println("--------------------------------------------------");
        System.out.println("===================== MK SHOP ====================");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~INVOICE~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println(super.getNmBrg() + "\n" + this.jmlhBeli + "x" + super.getHrg() + "\t=" + this.total);
        System.out.println("");
        System.out.println("SUBTOTAL = " + this.total());
        if (this.total() > 200000) {
            System.out.println("Diskon = 10%");
            System.out.println("total harga menjadi " + this.disc());
        }
        else {
            System.out.println("Diskon = 0%");
            System.out.println("total harga menjadi " + this.total());
        }
    }
    
    
}

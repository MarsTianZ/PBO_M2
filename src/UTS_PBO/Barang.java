/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;
import java.io.IOException;
/**
 *
 * @author Marsa Kristian
 */
public class Barang {
    String kdBrg, nmBrg;
    int hrg, stok;

    public Barang() {
    }
    
    public Barang(String kdBrg, String nmBrg, int hrg, int stok) {
        this.kdBrg = kdBrg;
        this.nmBrg = nmBrg;
        this.hrg = hrg;
        this.stok = stok;
    }

    public String getKdBrg() {
        return kdBrg;
    }

    public String getNmBrg() {
        return nmBrg;
    }

    public int getHrg() {
        return hrg;
    }

    public int getStok() {
        return stok;
    }
    
    public int stokUpd() {
        return 0;
    }
    
    public void entriData(Barang p) throws IOException {
    }
    
    public void entriData() throws IOException {
    }
}    

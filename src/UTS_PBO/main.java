/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_PBO;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;
/**
 *
 * @author Marsa Kristian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input1 =  new Scanner(System.in);
        Minuman p = new Minuman();
            do{
            System.out.println("=============== MK SHOP ===============");
            System.out.println("1. Masukkan data Barang");
            System.out.println("2. Masukkan data Penjualan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            int menu = input1.nextInt();
            System.out.println("");
            switch (menu) {
                case 1: {
                    p.entriData(p);
                    System.out.println("");
                    continue;
                }
                case 2: {
                   p.entriData();
                    System.out.println("");
                    continue;
                }
                case 3: {
                    System.exit(0);
                    continue;
                    }
                }
            } while(true);
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polymorphism_M6;

/**
 *
 * @author Marsa Kristian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //object
        Lingkaran lk = new Lingkaran();
        System.out.println("Luas (jari-jari) = "+lk.luas(3.0));
        
        System.out.println("Luas (diameter) = "+lk.luas(3.3f));
        
        Lingkaran lk2 = new Lingkaran_2();
        //cetak dari superclass
        lk.cetak();
        
        //cetak dari subclass
        lk2.cetak();
    }
    
}

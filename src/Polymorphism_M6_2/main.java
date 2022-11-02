/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polymorphism_M6_2;
import java.io.IOException;
/**
 *
 * @author Marsa Kristian
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        //Object
        NilaiMK nmk = new NilaiMK(null, null);
        NilaiMK npbo = new NilaiPBO(null, null);
        
        //Panggil overloading mehod (NMK)
        nmk.getData(); //inputan & tanpa parameter
        nmk.getData("Pradita"); //dengan parameter

        //memanggil overiding method (NPBO)
        System.out.println("ini Overriding method");
        System.out.println("Nilai PBO = "+npbo.hitungnilai(0, 0, 0));
    }
}

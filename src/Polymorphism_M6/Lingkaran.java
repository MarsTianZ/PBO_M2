/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism_M6;

/**
 *
 * @author Marsa Kristian
 */
public class Lingkaran {
    
    //fungsi yang berparameter
    //tipe data (spasi) nama method ==> fungsi
    
    //fungsi luas dengan jari-jari
    public double luas (double jariJari) {
        return (3.14*jariJari*jariJari);
    }
    
    //pake angka+f/return ()
    //fungsi luas dengan diameter 
    public float luas(float diameter){
        return (float) (0.25*3.14*diameter*diameter);
    }
    
    //Overriding Method
    //Method berjenis prosedur

    //Overriding Method
    //Method berjenis prosedur
    public void cetak(){
        System.out.println("Ini adalah Super Class");
    }
    
}

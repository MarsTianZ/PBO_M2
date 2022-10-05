/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Materi_Inheritance;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Marsa Kristian
 */
public class Mainclass_of_superclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        
        //object : subclass
        sub_class sub = new sub_class(0,"","");
        
        
        try{
            //input data
            System.out.print("Input nama : ");
            String n = input.nextLine();
            System.out.print("Input keterangan : ");
            String k = input.nextLine();
            System.out.print("Input tinggi : ");
            int t = input1.nextInt();
            
            //masukkan variabel ke dalam parameter object
            sub = new sub_class(t,n,k);
            
            // cetak data lengkap
            sub.dataLengkap();
            
            //panggil method cetak dan halo
            sub.cetak();
            sub.halo();
        }catch (Exception e){
            System.out.println(e);
            
        }
     
    }
    
}

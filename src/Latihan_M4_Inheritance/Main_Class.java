/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan_M4_Inheritance;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Marsa Kristian
 */
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        

        
        //deklarasi variabel
        String department,id, nama, address, title;
        
        try{
            //input
            System.out.print("masukkan jumlah data : ");
            int i = input1.nextInt();
            //object : Employee
            Employee emp[] = new Employee[i];
            for (int jumlah=0; jumlah<emp.length; jumlah++) {
            System.out.print("Entry ID          : ");
            id = input.nextLine();
            System.out.print("Entry Name        : ");
            nama = input.nextLine();
            System.out.print("Entry Address     : ");
            address = input.nextLine();
            System.out.print("Entry Title       : ");
            title = input.nextLine();
            
            
            //Masukkan ke object
            emp[jumlah] = new Employee
            ("", title, id, nama, address);

            }
            //output
            for (int jumlah=0; i<emp.length; i++){
            //cetak method getData dari class Employee
            emp[i].dataLengkap();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}

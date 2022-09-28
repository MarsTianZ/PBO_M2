/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_PBO_M3;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Marsa Kristian
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // scanner section
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        
        //object (instance of class)
        //karena ada 2 constructr, maka dibuat 2 object
        //1. admin
        //2. akun baru
        Akun admin  = new Akun();
        Akun akunbaru = new Akun("","");
        
       //Variabel
       String username, password;
        
        //menu
        do {
            System.out.println("--Login--");
            System.out.println("1. Login admin");
            System.out.println("2. Buat Akun baru");
            System.out.println("3. Lihat Akun");
            System.out.println("4. Ubah password");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            int menu = input1.nextInt();
            switch(menu){
                case 1:
                    System.out.println("==Login admin==");
                    System.out.print("Masukkan Username : ");
                    username = input.nextLine();
                    System.out.println("Masukkan Password");
                    password = input.nextLine();
                    
                    //mencocokkan username dan password
                    if (username.equalsIgnoreCase(admin.getUsername()) && password.equalsIgnoreCase(admin.getPassword())){
                        System.out.println("Sukses");
                    } else {
                        System.out.println("Gagal");
                    }
                    
                    break;
                case 2:
                    System.out.println("==Buat akun==");
                    System.out.print("Masukkan Username : ");
                    username = input.nextLine();
                    System.out.print("Masukkan Password : ");
                    password = input.nextLine();
                    
                    //memasukkan variabel ke dalam constructor
                    akunbaru = new Akun(username, password);
                    break;
                case 3:
                    System.out.println("==Lihat akun==");
                    System.out.println("1. Admin");
                    System.out.println("Username = "+admin.getUsername());
                    System.out.println("Password = "+admin.getPassword()
                    +"\n"); // untuk otomatis enter
                    System.out.println("2. Akun Baru");
                    System.out.println("Username = "+akunbaru.getUsername());
                    System.out.println("Password = "+akunbaru.getPassword());
                    break;
                case 4:
                    System.out.println("==Ubah password==");
                    //masukkan pass lama
                    System.out.print("Masukkan password lama : ");
                    password = input.nextLine();
                    //masukkan pass baru
                    System.out.print("Masukkan Password Baru : ");
                    //cocokkan pass lama dengan data yang sudah ada
                    if (password.equalsIgnoreCase(akunbaru.getPassword())){
                        akunbaru.setPassword(input.nextLine());
                    } else {
                        System.out.println("Gagal");
                    }
                      
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while(true);
    }
}

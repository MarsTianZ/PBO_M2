/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_M4_Inheritance;

/**
 *
 * @author Marsa Kristian
 */
public class Person {
    
    //atribut super class
    String id, nama, address;

    public Person(String id, String nama, String address) {
        this.id = id;
        this.nama = nama;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAddress() {
        return address;
    }
    
    public void cetak(){
        System.out.println(getNama() + getId() + " " + getAddress());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Marsa Kristian
 */
class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hwn = new Hewan(); 
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        hwn.suaraHewan();
        System.out.println("Kucing :");
        kucing.suaraHewan();
        System.out.println("Anjing :");
        anjing.suaraHewan();
  }
}

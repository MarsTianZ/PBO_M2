/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBO_PRAKTIKUM_M3;

/**
 *
 * @author Marsa Kristian
 */
public class main_spec_hp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //WITHOUT INPUT
        spec_hp spec_hp1 = new spec_hp("POCO F3","POCO","Android 12 with MIUI 13","Snapdragon 870 5G",8,256);
        spec_hp spec_hp2 = new spec_hp("iPhone 14 Pro","Apple","IOS 16","A16 Bionic",6,256);
        spec_hp spec_hp3 = new spec_hp("OPPO F5","OPPO","Android 7.1.1 with Color OS 3.2","Snapdragon 870 5G",6,64);
        spec_hp spec_hp4 = new spec_hp("Samsung S22 5G","SAMSUNG","Android 12 with One UI 4.1.1","Exynos 2200 5G",8,256);
        spec_hp spec_hp5 = new spec_hp("VIVO X80 Pro","VIVO","Android 12 with Funtouch UI 12","Snapdragon 8 Gen 1 5G",12,512);
        System.out.println("SPEC HP :");
        spec_hp1.show();
        System.out.println("SPEC HP :");
        spec_hp2.show();
        System.out.println("SPEC HP :");       
        spec_hp3.show();
        System.out.println("SPEC HP :"); 
        spec_hp4.show();
        System.out.println("SPEC HP :"); 
        spec_hp5.show();
        
        /*
        System.out.println(spec_hp1.getNama());
        System.out.println(spec_hp1.getMerk());
        System.out.println(spec_hp1.getOs());
        System.out.println(spec_hp1.getChipset());
        System.out.println(spec_hp1.getRam()+" GB");
        System.out.println(spec_hp1.getRom()+" GB");
        */
    }
}

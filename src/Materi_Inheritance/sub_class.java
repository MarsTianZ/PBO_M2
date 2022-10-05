/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materi_Inheritance;

/**
 *
 * @author Marsa Kristian
 */
public class sub_class extends super_class {

    //cnth atribut subclass:
    private int tinggi;
    
    //constructor berparameter dari super dan subclass
    public sub_class(int tinggi, String nama, String keterangan) {
        super(nama, keterangan);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    //custom method
    void dataLengkap(){
        System.out.println
        (super.getNama() + super.getKeterangan() + " " + getTinggi());
    }
    
    @Override
    public void cetak() {
        super.cetak();
    }

    @Override
    public void halo() {
        super.halo(); 
    }

 
        

}

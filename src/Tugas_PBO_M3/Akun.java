/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO_M3;

/**
 *
 * @author Marsa Kristian
 */
        
public class Akun {
    //username, password
    String username, password;
    
    // contructor parameter(akun baru)}
    public Akun() {
    username = "admin";
    password = "admin";
    }

    //user admin sudah ditentukan username dan passwordnya
    public Akun (String u, String p){
        username = u;
        password = p;
    }
    
    public Akun (String p){
        password = p;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}

    
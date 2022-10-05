/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_M4_Inheritance;

/**
 *
 * @author Marsa Kristian
 */
public class Employee extends Person{

    //atribut subclass
    private String department, title;
    
    //constructor berparameter dari super dan subclass

    public Employee(String department, String title, String id, String nama, String address) {
        super(id, nama, address);
        this.department = "Department IT";
        this.title = title;   
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }
    
    //custom method
    void dataLengkap(){
        System.out.println
        (super.getNama() + ", " + super.getId() + ", " + super.getAddress() + ", " + getDepartment() + ", " + getTitle());
    }


}

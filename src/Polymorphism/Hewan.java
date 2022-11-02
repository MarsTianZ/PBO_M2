/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Marsa Kristian
 */
class Hewan {
  public void suaraHewan() {
    System.out.println("INI HEWAN :");
  }
}

class Kucing extends Hewan {
  public void suaraHewan() {
    System.out.println("Meow");
  }
}

class Anjing extends Hewan {
  public void suaraHewan() {
    System.out.println("gukguk");
  }
}


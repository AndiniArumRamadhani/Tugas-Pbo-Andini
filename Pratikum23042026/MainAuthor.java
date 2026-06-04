/*
Nama: Andini Arum Ramadhani
Nim: 2501081007
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum23042026;

/**
 *
 * @author Andini arum karini
 */
public class MainAuthor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Author Rin = new Author ("Peter Lee", "peter@nowhere.com", 'm');
        System.out.println(Rin);
        
        Rin.setEmail("peter@nowhere.com");
        System.out.println(Rin);
        System.out.println("Name:"+Rin.getName());
        System.out.println("gender: "+Rin.getGender());
        System.out.println("Gmail:"+Rin.getEmail());
        
    }
       
}

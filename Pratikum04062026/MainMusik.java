/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum04062026;

/**
 *
 * @author Andini arum karini
 */
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gitar gitar = new Gitar(6,"Gitar Klasik","Petik");
        Keyboard keyboard = new Keyboard (true,"Yamaha Psr","Elektronik");
        
        System.out.println("------------Info Gitar---------------");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("------------Info Keyboard---------------");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
    
}

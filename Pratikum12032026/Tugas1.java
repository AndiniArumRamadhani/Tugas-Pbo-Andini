/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class Tugas1 {
  public static void main (String [] args) {
    int a,x,y;
    Scanner in = new Scanner (System.in);
    System.out.print("masukkan angka=");
        a =in.nextInt();
       
        y=1;
        
        while (a>=10){
            System.out.print("masukkan angka=");
            a = in.nextInt();
            y = y + 1;
             
        }
         System.out.println("Pengulangan dari 1 sampai"+y);
  } 
}
 
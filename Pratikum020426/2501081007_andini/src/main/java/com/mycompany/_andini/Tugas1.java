/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._andini;

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class Tugas1 {
  public static void main (String [] args) {
    int a,x,y;
    Scanner in = new Scanner (System.in);
    System.out.println("masukkan angka");
        a =in.nextInt();
        
        x=1;
        y=1;
        
        while (a>=10){
            y = y + 1;
            System.out.println("masukkan angka");
            a = in.nextInt();
             
        }
         System.out.println("Pengulangan dari 1 sampai"+a);
  } 
}

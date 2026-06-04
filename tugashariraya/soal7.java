/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugashariraya;

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class soal7 {
public static void main (String [] args){
    Scanner input= new Scanner (System.in);
    int total_lembur,upah_lembur = 0,jam_lembur;
    
    System.out.println("Masukkan jumlah lembur");
    jam_lembur=input.nextInt();
    
    if (jam_lembur > 50)
    {
        jam_lembur = 50;
        System.out.println("Batas maksimal lembur adalah 50 jam");
    }
    
    if (jam_lembur <=20)
    {
       upah_lembur=2000;
    }
    if (jam_lembur >=20)
    {
        upah_lembur=3000;
    }
    total_lembur= jam_lembur * upah_lembur;
    System.out.println("Total upah lembur="+total_lembur);
    System.out.println("Total upah perjam="+upah_lembur);  
}    
}

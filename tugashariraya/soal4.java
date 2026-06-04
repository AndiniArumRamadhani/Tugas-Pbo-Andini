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
public class soal4 {
public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    int angka_genap;
    
    System.out.println ("Masukkan bilangan genap");
    angka_genap=input.nextInt();
    
    while (angka_genap %2 !=0)
    {
        System.out.println ("yang Masukkan bilangan ganjil, ulangi!");
        System.out.println ("Masukkan bilangan genap");
        angka_genap=input.nextInt();
    }
    angka_genap=angka_genap +1;
    System.out.println("Hasil="+angka_genap);
}
}

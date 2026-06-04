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
public class soal5 {
public static void main (String [] args){
    Scanner input=new Scanner (System.in);
    int no_awal,no_akhir;
    
    System.out.println("Masukkan nomor awal");
    no_awal=input.nextInt();
    System.out.println("Masukkan nomor akhir");
    no_akhir=input.nextInt();
    System.out.println("kode Membuka portal rahasia");
    
    for (int n =no_awal; n <= no_akhir; n++){
        if (n % 3 == 0 && n % 4 == 0 )
        {
            System.out.print(n+ " ");
        }
    }
}    
}

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
public class soal3 {
public static void main (String [] args){
    
    Scanner input= new Scanner (System.in);
    int nilai_awal,nilai_akhir;
    int jumlah=0;
    int total=0;
    
    System.out.println("masukkan nilai awal");
    nilai_awal=input.nextInt();
    System.out.println("masukkan nilai akhir");
    nilai_akhir=input.nextInt();
    System.out.println("deret bilangan kelipatan");
    
    for (int n=nilai_awal; n<=nilai_akhir; n++){
        if (n % 11 == 0 && n%2 !=0){
           System.out.print(n + " ");
           total +=n;
           jumlah++;
        }
    }
    System.out.println("\njumlah deret:"+total);
    
    if (jumlah > 0){
        double rata=(double)total/jumlah;
        System.out.println("Rata rata:"+rata);
    }
    else{
        System.out.println("Tidak ada bilangan yang di temukan");
    }
}
}

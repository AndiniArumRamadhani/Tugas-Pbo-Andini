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
public class soal1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int jmlh_halaman,total_byr,x,jmlh_diterima,sisa_hal,sisa_uang;
        
        jmlh_halaman=50;
        total_byr=15000;
        
        System.out.println("masukkan jumlah halaman yang telah siap");
        x=input.nextInt();
        
        jmlh_diterima= x*total_byr;
        sisa_hal= jmlh_halaman - x;
        sisa_uang=sisa_hal*total_byr;
        
        System.out.println("jumlah uang yang di terima:"+jmlh_diterima);
        System.out.println("jumlah uang yang bisa di dapatkan:"+sisa_uang);
                
        
        
    }
}

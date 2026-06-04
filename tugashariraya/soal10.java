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
public class soal10 {
  public static void main (String [] args){
      Scanner input= new Scanner (System.in);
      int tujuan, kelas, tiket, harga, total, diskon, bayar;
        harga = 0;
        total = 0;
        diskon= 0;
        bayar = 0;
        
        System.out.print("Tujuan \n1. Jakarta \n2. Yogya \n3. Surabaya");
        System.out.println();
        
        System.out.print("Masukkan Tujuan : ");
        tujuan =input.nextInt();
        
        System.out.print("1. Eksekutif \n2. Bisnis \n3. Ekonomi");
        System.out.println();
        
        System.out.print("Masukkan Kelas : ");
        kelas =input.nextInt();
        
        System.out.print("Masukkan Jumlah Tiket : ");
        tiket =input.nextInt();
        
       switch(tujuan)
        {
            case 1 -> 
            {
                switch(kelas)
                {
                    case 1 -> harga = 70000;
                    case 2 -> harga = 40000;
                    case 3 -> harga = 10000;
                }
            }

            case 2 -> 
            {
                switch(kelas)
                {
                    case 1 -> harga = 80000;
                    case 2 -> harga = 50000;
                    case 3 -> harga = 20000;
                }
            }

            case 3 -> 
            {
                switch(kelas)
                {
                    case 1 -> harga = 90000;
                    case 2 -> harga = 60000;
                    case 3 -> harga = 30000;
                }
            }
        }

        total = harga * tiket;

        if(tiket >= 4 && ((tujuan == 3 && kelas == 1) || (tujuan == 2 && kelas == 3)))
        {
            diskon = total * 10 / 100;
        }

        bayar = total - diskon;

        System.out.println("\nHarga tiket = Rp" + harga);
        System.out.println("Total harga = Rp" + total);
        System.out.println("Diskon = Rp" + diskon);
        System.out.println("Total bayar = Rp" + bayar);
    }
}
   


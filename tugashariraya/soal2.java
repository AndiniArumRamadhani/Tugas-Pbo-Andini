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
public class soal2 {
  public static void main (String [] args){
      
      Scanner input= new Scanner (System.in);
      int pil,jmlh;
      
      double hrg=0, total=0, diskon=0, byr=0 ;
     
      
      System.out.println("Masukkan merk susu");
      System.out.println("1.merk x (Rp.40000)");
      System.out.println("2.merk y (Rp.50000)");
      System.out.println("3.merk z (rp.60000)");
      pil=input.nextInt();
      
      System.out.println("Masukkan jumlah yang dibeli");
      jmlh=input.nextInt();
      
     
      
      switch (pil){
          case 1:
              hrg=40000;
              total=hrg *jmlh;
              if (jmlh >=3){
                  diskon =(0.10 * total);
              }
              break;
              
          case 2:
              hrg=50000;
              total=hrg *jmlh;
              if (jmlh >3){
                  diskon =(int) (0.12 * total);
              }
              break;
              
          case 3:
              hrg=60000;
              if(jmlh >=1){
                  total=hrg;
                  if(jmlh > 1){
                      double sisa=(jmlh-1)*hrg;
                      diskon=(0.15 *sisa);
                      }
                     }
              break;
         
          default:
               System.out.println("pilihan tidak ada");
               return;
      }
              
          
      byr=total-diskon;
      
       System.out.println("Total pembelian :Rp"+total);
       System.out.println("Total Diskon    :Rp"+diskon);
       System.out.println("Total pembayaran:Rp"+byr);       

      
            
  }
  
}

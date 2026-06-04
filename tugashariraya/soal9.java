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
public class soal9 {
  public static void main (String [] args){
      Scanner input=new Scanner (System.in);
      int x,y,m,n;
      
      System.out.println("Masukkan input ukuran");
      y=input.nextInt();
              
      for (x = y; x >= 1; x--)
      {
          for (n = 1; n < x; n++)
          {
              System.out.print("  ");
          }
          for (m = x; m <= y; m++)
          {
              System.out.print(m + " ");
          }
          System.out.println();
      }
  }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class polapersegi {
    public static void main (String [] args){
    Scanner input =new Scanner (System.in);
    int i,n,j,k;
    System.out.println("Masukkan angka pertama");
    n=input.nextInt();
    System.out.println("Masukkan angka kedua");
    k=input.nextInt();
    
      for(i=1;i<=n;i++){
          for(j=1; j<=k; j++){
              System.out.print ("*");
          }
          System.out.println ();
      }
    
}
    
}

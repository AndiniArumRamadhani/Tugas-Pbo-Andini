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
public class soal8 {
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);
        int y,z ;
        
        for (y =1; y <= 5; y++)
        {
            for (z = 1; z <=5; z++)
            {
               
                 if (y == 1 || y == 5 || y == z)
                 {
                      System.out.print("0 ");
                 }
                  else
                {
                     System.out.print("x ");
                }    
            }
                 System.out.println();
         }
    
    }         
}

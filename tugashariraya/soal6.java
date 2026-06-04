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
public class soal6 {
public static void main (String [] args){
    Scanner input=new Scanner (System.in);
    int umur_pnp,dekade;
    
    System.out.println("masukkan umur pnp");
    umur_pnp=input.nextInt();
    
    if(umur_pnp %10==0)
    {
        dekade=umur_pnp/10;
        System.out.println("Dekade pnp yang ke"+dekade);
    }
    else{
        System.out.println("Dies natalis pnp yang ke"+umur_pnp);
    }
}    
}

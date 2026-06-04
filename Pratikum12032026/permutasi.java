/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andini arum karini
 */

import java.util.Scanner;
public class permutasi {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int i,j,k,permutasi,fakt1,fakt2;
        
        System.out.print("masukkan angka pertama=");
        j = input.nextInt();
        System.out.print("masukkan angka kedua=");
        k = input.nextInt();
        
        fakt1=1;
        fakt2=1;
        
        for (i=1; i<=j; i++){
            fakt1=fakt1 *i;
        }
        for (i=1; i<=j-k; i++){
            fakt2=fakt2 *i;
        } 
        permutasi=fakt1 / fakt2;
        System.out.println("Nilai permutasi= "+permutasi);
    }
    
}

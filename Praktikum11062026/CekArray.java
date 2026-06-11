/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11062026;

/**
 *
 * @author Andini arum karini
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class CekArray {
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        int[] angka ={10,20,30,40,50};
        try{
        System.out.print("Mau Ditampil Array Indeks ke berapa=");
        int index=input.nextInt();
        System.out.println("Nilai Array Adalah = "+angka[index]);
        System.out.print("Mau Dibagi Berapa=");
        System.out.print("Mau Dibagi Berapa=");
        int n=input.nextInt();
        int hasil =angka[index]/n;
        System.out.println("Hasil Pembagian ="+hasil);
        
    }catch(InputMismatchException e){
        System.out.println("Patikan Input Merupakan Bilangan Bulat");
    }catch(ArithmeticException e){
        System.out.println("Angka Tidak Boleh 0");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index Diluar Range Array");
    }finally{
        System.out.println("-----Tampilkan Array-----");    
        System.out.println("Cara 1 =");
            for(int i=0;i<angka.length;i++)
            System.out.print(""+angka[i]);
            System.out.println();
            System.out.println("Cara 2=");
            System.out.println("isi Array"+Arrays.toString(angka));
         }
    }
}



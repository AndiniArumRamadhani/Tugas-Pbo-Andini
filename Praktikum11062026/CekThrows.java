/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11062026;

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
import java.util.*;
public class CekThrows {
     public static void CekAngka(int a)throws Exception{
         //body throw
         if(a<0){
             throw new Exception("Nilai Tidak Boleh Negatif");
         }else if(a>100){
              throw new Exception("Nilai Tidak Boleh Melebihi 100");
         }
            
     }

     public static void main(String[]args){
     Scanner input= new Scanner (System.in);
     System.out.print("Masukkan Sebuah Angka=");
     int angka=input.nextInt();
     try{
         CekAngka(angka);
         System.out.println("Nilai Berhasil Disimpan");
         }catch(Exception e){
          System.out.println("Error"+e.getMessage());   
     }
       
    }
}


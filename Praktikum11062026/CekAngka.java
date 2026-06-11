/*
Tugas Pbo
Nama:Andini Arum Ramadhani
Nim:2501081007
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
public class CekAngka {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int a,b;
    int hasil;
    try{
    System.out.print("Masukkan Bilangan Pertama=");
    a= input.nextInt();
    System.out.print("Masukkan Bilangan Kedua=");
    b = input.nextInt();
    hasil =a/b;
    System.out.println(a+"/"+b+"="+hasil);
    }catch(InputMismatchException e){
        System.out.println("Masukkan Nilai Berupa Angka");
    
    }catch(ArithmeticException e){
        System.out.println("Nilai Kedua Atau Penyebut Tidak Boleh 0");
    }catch(Exception e){
        System.out.println("Error Tidak Terguna"+e.getMessage());
    }finally{
        System.out.println("Pengecekkan Nilai Selesai");
    }
    }
}

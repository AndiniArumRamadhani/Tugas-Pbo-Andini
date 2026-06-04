/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum020426;

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class mainpersegipanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objec ppl menggunakan construktor 1
        persegipanjang ppl = new persegipanjang();
        ppl.panjang=10;
        ppl.lebar=7;
        System.out.println("object 1 menggunakan constructor 1");
        System.out.println("Akses method dalam main class");
        System.out.println("luas persegi panjang="+ppl.HitungLuas());
        System.out.println("keliling ="+ppl.HitungKel());
        System.out.println();
        ppl.TampilData();
        
        ///object pp2 menggunakan construktor 2
        System.out.println("object 2 menggunakan constructor 2");
        persegipanjang pp2= new persegipanjang(19,10);
        System.out.println("Akses method dalam main class");
        System.out.println("luas persegi panjang="+pp2.HitungLuas());
        System.out.println("keliling ="+pp2.HitungKel());
        System.out.println();
        pp2.TampilData();
        
        /// object pp3 menggunakan constructor 3
        System.out.println("\nobject 3 menggunakan constructor 3");
        System.out.println("panjang dan lebar input user");
        Scanner input = new Scanner (System.in);
        System.out.print("\nmasukkan panjang=");
        int pjg=input.nextInt();
        System.out.print("masukkan lebar=");
        int lbr=input.nextInt();
        persegipanjang pp3= new persegipanjang(pjg,lbr);
        pp3.TampilData();
    }
       
}

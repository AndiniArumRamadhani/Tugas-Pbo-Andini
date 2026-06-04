/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum090426;

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class MainPersegiPanjangEnkapkulasi {
     public static void main(String[] args) {
        // TODO code application logic here
        //objec ppl menggunakan construktor 1
        System.out.println("jumlah objek "+PersegiPanjangEnkapkulasi.getJumlahObjek());
        PersegiPanjangEnkapkulasi ppl = new PersegiPanjangEnkapkulasi();
        ppl.setPanjang (10);
        ppl.setlebar (7);
        
        System.out.println("object 1 menggunakan constructor 1");
        System.out.println("Akses method dalam main class");
        System.out.println("luas persegi panjang="+ppl.HitungLuas());
        System.out.println("keliling ="+ppl.HitungKel());
        System.out.println();
        ppl.TampilData();
        
        ///object pp2 menggunakan construktor 2
        System.out.println("object 2 menggunakan constructor 2");
        PersegiPanjangEnkapkulasi pp2 = new PersegiPanjangEnkapkulasi(19,10);
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
        PersegiPanjangEnkapkulasi pp3 = new PersegiPanjangEnkapkulasi(pjg,lbr);
        pp3.TampilData();
        System.out.println("jumlah objek "+PersegiPanjangEnkapkulasi.getJumlahObjek());
    }
       
}



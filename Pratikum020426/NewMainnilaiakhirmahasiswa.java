/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_andini;

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class NewMainnilaiakhirmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objec ppl menggunakan construktor 1
        nilaimahasiswa pp1= new nilaimahasiswa(); 
        pp1.nama="andini cantik banget";
        pp1.nobp="2501081007";
        pp1.tugas=80.2;
        pp1.uts=90.5;
        pp1.uas=99.9;
        System.out.println("object 1 menggunakan constructor 1");
        System.out.println("Akses method dalam main class");
        System.out.println("nilai akhir mahasiswa="+pp1.nilaiakhir());
        System.out.println();
        pp1.tampildata();
        
        
         //objec pp3 menggunakan input user 3
        System.out.println("\nobject 3 menggunakan constructor 3");
        System.out.println("nilai mahasiswa input user");
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nama=");
        String nama=input.nextLine();
        System.out.print("masukkan nobp=");
        String nobp=input.nextLine();
        System.out.print("masukkan nilai tugas=");
        Double tgs=input.nextDouble();
        System.out.print("masukkan nilai uts=");
        Double uts=input.nextDouble();
        System.out.print("masukkan nilai uas=");
        Double uas=input.nextDouble();
        nilaimahasiswa pp3= new nilaimahasiswa(tgs,uts,uas);
        pp3.tampildata();
    }
    
}

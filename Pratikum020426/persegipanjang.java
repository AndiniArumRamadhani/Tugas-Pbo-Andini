/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum020426;

/**
 *
 * @author Andini arum karini
 */
public class persegipanjang {///public =access modifier??
    //atribut variabel
    int panjang;
    int lebar;
    
    //constructor kosong
    persegipanjang(){
    
}
    //cunsturktor 2=overloading
    persegipanjang(int p, int l){
        panjang=p;
        lebar=l;
    }
    ///method dengan nilai kembalian
   int HitungLuas(){
       return (panjang*lebar);
   } 
   int HitungKel(){
       return(2*panjang*lebar);
   }
   ///method tanpa kembalian
   void TampilData(){
       System.out.println("panjang persegi panjang ="+panjang);
       System.out.println("panjang persegi lebar ="+lebar);
       System.out.println("luas persegi panjang ="+HitungLuas());
       System.out.println("Keliling ="+HitungKel());
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_andini;

/**
 *
 * @author Andini arum karini
 */
public class nilaimahasiswa {
    ///atribut variabel
    String nama,nobp;
    Double tugas,uts,uas;
    
    nilaimahasiswa (){
        
    }
    nilaimahasiswa(double tgs,double ut,double ua){
        tugas=tgs;
        uts=ut;
        uas=ua;
    }
    double nilaiakhir(){
    return ((0.25*tugas)+(0.35*uts)+(0.4*uas));
    
}
    void tampildata(){
       System.out.println("nilai tugas="+tugas);
       System.out.println("nilai uts="+uts);
       System.out.println("nilai uas ="+uas);
       System.out.println("Nilai akhir mahasiswa ="+nilaiakhir());
  
    }
            
}

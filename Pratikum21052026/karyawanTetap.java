/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum21052026;

/**
 *
 * @author Andini arum karini
 */
public class karyawanTetap extends karyawan{
   private int golongan;
   private int gajiPokok;
   private double tunjangan;

    public karyawanTetap(int golongan, String nama, String nik) {
        super(nama, nik);
        this.golongan = golongan;
    }

    

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public void TampilkanData() {
       System.out.println("Nama Karyawan:"+nama);
       System.out.println("Nik Karyawan:"+nik);
       switch(golongan){
           case 1:
               gajiPokok=10000000;
           break;
           
           case 2:
               gajiPokok=20000000;
           break;
           
           case 3:
               gajiPokok=30000000;
           break; 
       }
       tunjangan=0.12*gajiPokok;
       System.out.println("Golongan Karyawan:"+golongan);
       System.out.println("Gaji Pokok:"+gajiPokok);
       System.out.println("Tunjangan Karyawan:"+tunjangan);
       
       double totalGaji=gajiPokok+tunjangan;
       System.out.println("Total Gaji Karyawan"+totalGaji);
    }
   
   
}

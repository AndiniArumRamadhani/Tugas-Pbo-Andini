/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum30042026;

/**
 *
 * @author Andini arum karini
 */
public class Kendaraan {
    private String nama;
    private int thnProduksi;

public Kendaraan(){
    
}

public Kendaraan(String nama,int thnProduksi){
    this.nama= nama;
    this.thnProduksi=thnProduksi;
}


public String getNama(){
    return nama;
}
public void setNama(String nama){
    this.nama=nama;
}
public int getthnProduksi(){
    return thnProduksi;
}
public void setthnProduksi(int thnProduksi ){
    this.thnProduksi= thnProduksi;
}
public void cetak(){
    System.out.println("Nama kendaraan:"+nama);
    System.out.println("Tahun Produksi:"+thnProduksi);

} 
}

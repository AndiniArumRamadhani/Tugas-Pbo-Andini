/*
Tugas Pbo
Nama:Andini Arum Ramadhani
Nim:2501081007
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum04062026;

/**
 *
 * @author Andini arum karini
 */
public abstract class AlatMusik {
    protected String Nama;
    protected String Jenis;

    public AlatMusik(String Nama, String Jenis) {
        this.Nama = Nama;
        this.Jenis = Jenis;
    }
    public void info(){
        System.out.println("Nama alat Musik :"+Nama+".Jenis="+Jenis);
    }
    //contoh method polymorphism
    public abstract void mainkan();
    public abstract void stem();
    
    
    
}

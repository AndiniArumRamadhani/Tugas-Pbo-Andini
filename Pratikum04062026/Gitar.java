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
public class Gitar extends AlatMusik{
    private int JumlahSenar;

    public Gitar(int JumlahSenar, String Nama, String Jenis) {
        super(Nama, Jenis);
        this.JumlahSenar = JumlahSenar;
    }
    
    
    @Override
    public void mainkan() {
        System.out.println(Nama+"dipetik dengan+"+JumlahSenar+"senar.");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem Gitar"+Nama+"Secara Manual");
    }

    public int getJumlahSenar() {
        return JumlahSenar;
    }

    public void setJumlahSenar(int JumlahSenar) {
        this.JumlahSenar = JumlahSenar;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
    
    
}

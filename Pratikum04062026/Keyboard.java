/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum04062026;

/**
 *
 * @author Andini arum karini
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan {
   private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }
    

    @Override
    public void mainkan() {
        System.out.println(Nama+" dimainkan dengan menekan tuts.");

    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+Nama+" distem digital dengan aplikasi");

    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(Nama+ " dinyalakan.");
        }
        else{
            System.out.println(Nama+"todak bisa dinyalakan karena tidak ada daya.");
        }

    }

    @Override
    public void matikan() {
        System.out.println(Nama+" dimatikan.");
    }

    @Override
    public boolean cekListrik() {
       return dayaTersambung;
    } 
    
}

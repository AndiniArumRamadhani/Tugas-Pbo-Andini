/*
Tugas Pbo
Nama:Andini Arum Ramadhani
Nim:2501081007
 */
package Pratikum21052026;

/**
 *
 * @author Andini arum karini
 */
public class motor extends kendaraanRental{
    private int biayaRental;
    private int lamaRental;
    private int KapasitasTangki;

    public motor() {
    }

    public motor(int biayaRental, int lamaRental, int KapasitasTangki, String noPolisi, String Merk) {
        super(noPolisi, Merk);
        this.biayaRental = biayaRental;
        this.lamaRental = lamaRental;
        this.KapasitasTangki = KapasitasTangki;
    }

    public int getBiayaRental() {
        return biayaRental;
    }

    public void setBiayaRental(int biayaRental) {
        this.biayaRental = biayaRental;
    }

    public int getLamaRental() {
        return lamaRental;
    }

    public void setLamaRental(int lamaRental) {
        this.lamaRental = lamaRental;
    }

    public int getKapasitasTangki() {
        return KapasitasTangki;
    }

    public void setKapasitasTangki(int KapasitasTangki) {
        this.KapasitasTangki = KapasitasTangki;
    }

    @Override
    public void TampilkanData() {
        System.out.println("=====Data Rental Motor=====");
        System.out.println("No polisi"+noPolisi);
        System.out.println("Merk Mobil"+Merk); 
        System.out.println("Biaya PerHari:RP"+biayaRental);
        System.out.println("Lama Rental:"+lamaRental+"Hari");
        System.out.println("kapasitas Tangki"+KapasitasTangki+"Liter");
        System.out.println("Total Bayar:Rp"+(biayaRental*lamaRental));
    }
    
    
}

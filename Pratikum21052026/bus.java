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
public class bus extends kendaraanRental{
   private int biayaRental;
   private int lamaRental;
   private int kapasitasBus;

    public bus() {
    }

    public bus(int biayaRental, int lamaRental, int kapasitasBus, String noPolisi, String Merk) {
        super(noPolisi, Merk);
        this.biayaRental = biayaRental;
        this.lamaRental = lamaRental;
        this.kapasitasBus = kapasitasBus;
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

    public int getKapasitasBus() {
        return kapasitasBus;
    }

    public void setKapasitasBus(int kapasitasBus) {
        this.kapasitasBus = kapasitasBus;
    }

    @Override
    public void TampilkanData() {
        System.out.println("=====Data Rental Mobil=====");
        System.out.println("No polisi"+noPolisi);
        System.out.println("Merk Mobil"+Merk); 
        System.out.println("Biaya PerHari:RP"+biayaRental);
        System.out.println("Lama Rental:"+lamaRental+"Hari");
        System.out.println("Kapasitas Muat Bus"+kapasitasBus);
        System.out.println("Total Bayar:Rp"+(biayaRental*lamaRental));
    }
   
   
}

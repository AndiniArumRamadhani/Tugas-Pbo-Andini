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
public class mobil extends kendaraanRental{
    private int biayaRental;
    private int lamaRental;
    private int jumlahKursi;

    public mobil() {
    }

    public mobil(int biayaRental, int lamaRental,int jumlahKursi, String noPolisi, String Merk) {
        super(noPolisi, Merk);
        this.biayaRental = biayaRental;
        this.lamaRental = lamaRental;
        this.jumlahKursi=jumlahKursi;
    }

    @Override
    public void TampilkanData() {
        System.out.println("=====Data Rental Mobil=====");
        System.out.println("No polisi"+noPolisi);
        System.out.println("Merk Mobil"+Merk); 
        System.out.println("Biaya PerHari:RP"+biayaRental);
        System.out.println("Lama Rental:"+lamaRental+"Hari");
        System.out.println("Jumlah Kursi"+jumlahKursi);
        System.out.println("Total Bayar:Rp"+(biayaRental*lamaRental));
    }
    
}

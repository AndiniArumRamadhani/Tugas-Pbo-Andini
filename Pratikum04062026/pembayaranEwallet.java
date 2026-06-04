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
public class pembayaranEwallet extends pembayaran implements CetakStruk{
    private String jenisEwallet;

    public pembayaranEwallet(String jenisEwallet, double jmlBayar, String idTransaksi) {
        super(jmlBayar, idTransaksi);
        this.jenisEwallet = jenisEwallet;
    }

    public String getJenisEwallet() {
        return jenisEwallet;
    }

    public void setJenisEwallet(String jenisEwallet) {
        this.jenisEwallet = jenisEwallet;
    }

    @Override
    public void prosespembayaran() {
        System.out.println("Proses Pembayaran Secara E-wallet");
        System.out.println("Jenis E-wallet:"+jenisEwallet);
        System.out.println("Id Transaksi:"+idTransaksi);
        System.out.println("Jumlah Bayar:"+jmlBayar);
        System.out.println("\nThank You");

    }

    @Override
    public void Cetak() {
       System.out.println("-----Struk Pembayaran E-Wallet----");
       System.out.println("ID Transaksi="+idTransaksi);
       System.out.println("Jumlah Bayar="+jmlBayar);
       System.out.println("Jenis E-wallet:"+jenisEwallet);
    }
    
}

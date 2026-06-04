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
public class pembayaranTransfer extends pembayaran implements CetakStruk{
    private String namaBank;

    public pembayaranTransfer(String namaBank, double jmlBayar, String idTransaksi) {
        super(jmlBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosespembayaran() {
        System.out.println("Proses pembayaran dengan cara Transfer");
        System.out.println("Bank:"+namaBank);
        System.out.println("Id Transaksi:"+idTransaksi);
        System.out.println("Jumlah Bayar:"+jmlBayar);
        System.out.println("\nThank You");
    }

    @Override
    public void Cetak() {
       System.out.println("-----Struk Pembayaran Transfer-----");
       System.out.println("Bank:"+namaBank);
       System.out.println("Id Transaksi:"+idTransaksi);
       System.out.println("Jumlah Bayar:"+jmlBayar);

    }
    
}

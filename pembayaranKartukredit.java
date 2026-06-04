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
public class pembayaranKartukredit extends pembayaran implements CetakStruk{
    private String jenisKartu;
    private String noKartu;

    public pembayaranKartukredit(String jenisKartu, String noKartu, double jmlBayar, String idTransaksi) {
        super(jmlBayar, idTransaksi);
        this.jenisKartu = jenisKartu;
        this.noKartu = noKartu;
    }

    public String getJenisKartu() {
        return jenisKartu;
    }

    public void setJenisKartu(String jenisKartu) {
        this.jenisKartu = jenisKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    @Override
    public void prosespembayaran() {
        System.out.println("Proses Pembayaran melalui kartu kredit");
        System.out.println("Jenis kartu kredit:"+jenisKartu);
        System.out.println("No kartu kredit:"+noKartu);
        System.out.println("Id Transaksi:"+idTransaksi);
        System.out.println("Jumlah Bayar:"+jmlBayar);
        System.out.println("\nThank You");
    }

    @Override
    public void Cetak() {
        System.out.println("-----Struk Pembayaran kartu kredit-----");
        System.out.println("Jenis kartu kredit:"+jenisKartu);
        System.out.println("No kartu kredit:"+noKartu);
        System.out.println("Id Transaksi:"+idTransaksi);
        System.out.println("Jumlah Bayar:Rp."+jmlBayar);
        
    }
    
    
}

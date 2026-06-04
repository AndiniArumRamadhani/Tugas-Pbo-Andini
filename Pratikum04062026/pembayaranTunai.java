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
public class pembayaranTunai extends pembayaran implements CetakStruk{
    private double uang;

    public pembayaranTunai(double uang, double jmlBayar, String idTransaksi) {
        super(jmlBayar, idTransaksi);
        this.uang = uang;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    @Override
    public void prosespembayaran() {
        System.out.println("Proses Pembayaran Secara Tunai");
        System.out.println("Id Transaksi:"+idTransaksi);
        System.out.println("Jumlah Bayar:Rp."+jmlBayar);
        System.out.println("Jumlah Uang Nasabah:Rp."+uang);
        
    if (uang>jmlBayar)
    {
      double kembalian=uang-jmlBayar;
      System.out.println("Proses Pembayaran Berhasil");
      System.out.println("Uang kembalian:Rp."+kembalian);
      System.out.println("\nThank You");
        
    }    
    else{
        double kekurangan=jmlBayar-uang;
        System.out.println("Pembayaran Tidak Berhasil");
        System.out.println("Pembayaran Tidak Cukup :Rp."+kekurangan);
        System.out.println("\n Harap Lakukan pembayaran ulang!!!");
    }   
    }

    @Override
    public void Cetak() {
        System.out.println("-----Struk Pembayaran Tunai-----");
        System.out.println("Id Transaksi:"+idTransaksi);
        System.out.println("Jumlah Bayar:Rp."+jmlBayar);
        System.out.println("Jumlah Uang Nasabah:Rp."+uang);
    }
     
}

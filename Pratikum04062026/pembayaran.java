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
public abstract class pembayaran {
    protected double jmlBayar;
    protected String idTransaksi;

    public pembayaran() {
    }

    public pembayaran(double jmlBayar, String idTransaksi) {
        this.jmlBayar = jmlBayar;
        this.idTransaksi = idTransaksi;
    }

    public double getJmlBayar() {
        return jmlBayar;
    }

    public void setJmlBayar(double jmlBayar) {
        this.jmlBayar = jmlBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
    public abstract void prosespembayaran();
    
}

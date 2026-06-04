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
public abstract class kendaraanRental {
    protected String noPolisi;
    protected String Merk;
    
public kendaraanRental() {
}

public kendaraanRental(String noPolisi, String Merk) {
    this.noPolisi = noPolisi;
    this.Merk = Merk;
}

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }
   public abstract void TampilkanData();
}

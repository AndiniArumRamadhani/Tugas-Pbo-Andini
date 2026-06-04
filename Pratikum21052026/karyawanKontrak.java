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
public class karyawanKontrak extends karyawan{
    private int honor;
    private int uangMakan;

    public karyawanKontrak(int honor, String nama, String nik) {
        super(nama, nik);
        this.honor = honor;
        this.uangMakan = 300000;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(int uangMakan) {
        this.uangMakan = uangMakan;
    }

    @Override
    public void TampilkanData() {
       System.out.println("Nama Karyawan:"+nama);
       System.out.println("Nik Karyawan:"+nik);
       System.out.println("Honor Karyawan:"+honor);
       System.out.println("Uang makanan karyawan:"+uangMakan);
    }
     
}

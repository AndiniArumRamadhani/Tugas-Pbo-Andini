/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum090426;

/**
 *
 * @author Andini arum karini
 */
public class MahasiswaEnkapsulasi {
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk;
    private static int jumlahObjek;
    
    MahasiswaEnkapsulasi (){
        jumlahObjek++;
    }
    MahasiswaEnkapsulasi(String namaMhs,String nimMhs){
        this.nama=namaMhs;
        this.nim=nimMhs;
    }
    MahasiswaEnkapsulasi (String namaMhs,String nimMhs,String jrsnMhs,int umurMhs,double ipkMhs){
        this.nama=namaMhs;
        this.nim=nimMhs;
        this.jurusan=jrsnMhs;
        this.umur=umurMhs;
        this.ipk=ipkMhs;
        jumlahObjek++;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getJurusan(){
        return jurusan;
    }
    public int getUmur(){
        return umur;
    }
    public double getipk(){
        return ipk;
    }
    public void setnama(String namaMhs){
        nama=namaMhs;
    }
    public void setnim(String nimMhs){
        nim=nimMhs;
    }
    public void setjurusan(String jrsnMhs){
        jurusan=jrsnMhs;

    }
    public void setumur(int umurMhs){
        umur=umurMhs;
    }
    public void setipk(double ipkMhs){
        ipk=ipkMhs;
    } 
    public static int getJumlahObjek() {
        return jumlahObjek;
    }
    
    public String statusKelulusan(){
        if (ipk>=2.75){
            return "Lulus";
            
        }
        
        else{
            return "Tidak Lulus";
        }
    } 
        
    void tampildata(){
       System.out.println("Nama="+nama);
       System.out.println("Nim="+nim);
       System.out.println("Jurusan="+jurusan);
       System.out.println("umur="+umur);
       System.out.println("ipk="+ipk);
       
    
  
    }

    void TampilData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}



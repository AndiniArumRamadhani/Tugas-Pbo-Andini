/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum090426;

/**
 *
 * @author Andini arum karini
 */
public class PersegiPanjangEnkapkulasi {
    private int panjang;
    private int lebar;
    private static int jumlahobjek=0;
            
    //constructor kosong
    PersegiPanjangEnkapkulasi(){
        jumlahobjek++;
}
    //cunsturktor 2=overloading
    PersegiPanjangEnkapkulasi(int p, int l){
        this.panjang=p;
        this.lebar=l;
        jumlahobjek++;
    }
    ///method dengan nilai kembalian
   int HitungLuas(){
       return panjang;
   } 
   int HitungKel(){
       return lebar;
   }
   //setter
   public void setPanjang (int panjangBaru){
     panjang=panjangBaru;
}
   //getter
   public int getPanjang(){
       return panjang;
   }
   public void setlebar (int lebarBaru){
       lebar=lebarBaru;
   }
   public int getlebar(){
       return lebar;
   }
   public static int getjumlahobjek(){
       return jumlahobjek;
   }
   public int getLuas(){
       return panjang*lebar;
   }
   public int getKeliling(){
       return 2*(panjang+lebar);
   }
    public static int getJumlahObjek() {
        return jumlahobjek;
    }
   ///method tanpa kembalian
   void TampilData(){
       System.out.println("panjang persegi panjang ="+panjang);
       System.out.println("panjang persegi lebar ="+lebar);
       System.out.println("luas persegi panjang ="+getLuas());
       System.out.println("Keliling ="+getKeliling());
   }
  
}





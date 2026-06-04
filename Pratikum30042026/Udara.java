/*Nama Andini Arum Ramadhani
/*Nim 2501081007
* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum30042026;

/**
 *
 * @author Andini arum karini
 */
public class Udara extends Kendaraan {
    private boolean mesin;
    
    public Udara(){
        super();
    }
    
    public Udara(String nama,int thnProduksi, boolean mesin){
        super(nama,thnProduksi);
        this.mesin=mesin;
    }
    public boolean getMesin(){
    return mesin;
    } 
    public void  setMesin(boolean mesin){
        this.mesin=mesin;
    }
    
    
    @Override
    public void cetak(){
        
        System.out.println("Menggnakan Mesin:"+(mesin ?"ya":"Tidak"));
    }
            
   
}

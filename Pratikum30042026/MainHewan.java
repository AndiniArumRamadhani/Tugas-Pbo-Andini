/*Nama Andini Arum Ramadhani
/*Nim 2501081007
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum30042026;

/**
 *
 * @author Andini arum karini
 */
public class MainHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hewan hewanUmum= new hewan ("Makluk");
        anjing anjingku= new anjing ("Mona");
        buaya buayaku= new buaya ("Buaya Darat");
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        
        System.out.println();
        
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
        System.out.println();
        
        buayaku.tampilkanNama();
        buayaku.bersuara();
        
        System.out.println();
        
    }
    
}

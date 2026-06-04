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
import java.util.Scanner;
public class MainKendaraanRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       kendaraanRental rental = null;
       
       System.out.println("==========Sistem Rental Kendaraan==========");
       
       System.out.println("\nPilih Kendaraan:");
       System.out.println("1. Mobil");
       System.out.println("2. Motor");
       System.out.println("3. Bus");
       System.out.print("Masukkan Pilihan : ");
       int pil = input.nextInt();
       input.nextLine();
       
       System.out.print("Masukkan No Polisi : ");
       String noPolisi = input.nextLine();

       System.out.print("Masukkan Merk Kendaraan : ");
       String merk = input.nextLine();

       System.out.print("Masukkan Lama Rental (hari) : ");
       int lamaRental = input.nextInt();
       
       
       switch(pil){
           case 1:
                System.out.print("Masukkan Biaya Rental Per Hari : ");
                int biayaMobil = input.nextInt();

                System.out.print("Masukkan Jumlah Kursi : ");
                int pintu = input.nextInt();

                rental = new mobil(biayaMobil,lamaRental,pintu,noPolisi,merk);
                break;
                
           case 2:     
                System.out.print("Masukkan Biaya Rental Per Hari : ");
                int biayaMotor = input.nextInt();

                System.out.print("Masukkan Kapasitas Tangki : ");
                int tangki = input.nextInt();  
                
                rental = new motor(biayaMotor,lamaRental,tangki,noPolisi,merk);
                break;
                
           case 3:
               
                System.out.print("Masukkan Biaya Rental Per Hari : ");
                int biayaBus = input.nextInt();

                System.out.print("Masukkan Kapasitas Penumpang: ");
                int kapasitas = input.nextInt();
                
                rental = new bus(biayaBus,lamaRental,kapasitas,noPolisi,merk);
                break;
               
       }
       System.out.println("=====================================");
       System.out.println("========Data Rental Kendaraan========");
       System.out.println("=====================================");
       
       rental.TampilkanData();
    }
    
    
}

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
public class MainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        pembayaran pembayaran = null;
        CetakStruk c=null;
        
        System.out.println("==========Andini Mart=========");
        
        System.out.print("Masukkan Id Transakasi:");
        String idTransaksi=input.nextLine();
        
        System.out.print("Masukkan Jumlah Pembayaran:");
        double jmlBayar=input.nextDouble();
        
        System.out.println("\nSilahkan Pilih Proses Pembayaran");
        System.out.println("1.Pembayaran Tunai");
        System.out.println("2.Pembayaran Transfer");
        System.out.println("3.Pembayaran E-wallet");
        System.out.println("4.Pembayaran Kartu Kredit");
        System.out.print("Pilihan Anda:");
        int pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1: System.out.print("Masukkan Jumlah Uang:");
            double uang=input.nextDouble();
            pembayaran =new pembayaranTunai(uang,jmlBayar,idTransaksi);
            c=(CetakStruk)pembayaran;
            break;
            
            case 2: System.out.print("Masukkan Nama Bank:");
            String namaBank=input.nextLine();
            pembayaran =new pembayaranTransfer(namaBank,jmlBayar,idTransaksi);
            c=(CetakStruk)pembayaran;
            break;
            
            case 3: System.out.print("Masukkan Jenis E-wallet:");
            String jenisEwallet=input.nextLine();
            pembayaran =new pembayaranEwallet(jenisEwallet,jmlBayar,idTransaksi);
            c=(CetakStruk)pembayaran;
            break;
            
            case 4: System.out.print("Masukkan Jenis Kartu Kredit:");
            String jenisKartu=input.nextLine();
            pembayaran =new pembayaranEwallet(jenisKartu,jmlBayar,idTransaksi);
            c=(CetakStruk)pembayaran;
            break;
        }
        System.out.println("=====Lihat Pembayaran=====");
        pembayaran.prosespembayaran();
        
        System.out.println();
        c.Cetak();
    }
    
}

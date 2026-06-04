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
public class mainKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        karyawan karyawan=null;
        
        System.out.println("=====Gaji Karaywan Andini=====");
        System.out.println("1.Karyawan Tetap");
        System.out.println("2.Karyawan Kontrak");
        System.out.print("Pilih jenis karyawan:");
        int pilih =input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Nik: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        
        if (pilih ==1) {
            System.out.print("Masukkan Golongan (1-3) : ");
            int golongan = input.nextInt();
            karyawan= new karyawanTetap(golongan,nama,nik);
        
        }else if(pilih == 2) {
            System.out.print("Masukkan Honor Kontrak : ");
            int honor = input.nextInt();
            karyawan= new karyawanKontrak(honor,nama,nik);
        }else{
           System.out.println("Masukkan Honor Kontrak");
           int honor=input.nextInt();
           karyawan= new karyawanKontrak(honor,nama,nik);
        }
        System.out.println("========Data Gaji Karyawan=======");
        karyawan.TampilkanData();
        
       
    
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum090426;

/**
 *
 * @author Andini arum karini
 */
import java.util.Scanner;
public class MainMahasiswaEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MahasiswaEnkapsulasi pp1= new MahasiswaEnkapsulasi(); 
        pp1.setnama("andini cantik banget");
        pp1.setnim("2501081007");
        pp1.setjurusan("Teknologi Informasi");
        pp1.setumur(18);
        pp1.setipk(4.00);
        System.out.println("object 1 menggunakan constructor 1");
        System.out.println("Akses method dalam main class");
        System.out.println();
        pp1.tampildata();
        System.out.println("Status Kelulusan:"+pp1.statusKelulusan());
        
        System.out.println("object 2 menggunakan constructor 2");
        System.out.println("Akses method dalam main class");
        MahasiswaEnkapsulasi pp2 = new MahasiswaEnkapsulasi("Andini Arum Ramadhani","2501081007","Teknologi Informasi",18,4.00);
        System.out.println();
        pp2.tampildata();
        System.out.println("Status Kelulusan:"+pp2.statusKelulusan());
        
        System.out.println("\nobject 3 menggunakan constructor 3");
        System.out.println("input user");
        Scanner input = new Scanner (System.in);
        System.out.print("\nmasukkan nama=");
        String namaMhs=input.nextLine();
        System.out.print("masukkan Nim=");
        String nimMhs=input.nextLine();
        System.out.print("masukkan Jurusan=");
        String jrsnMhs=input.nextLine();
        System.out.print("masukkan Umur=");
        int umurMhs=input.nextInt();
        System.out.print("masukkan Ipk=");
        double ipkMhs=input.nextDouble();
        
        MahasiswaEnkapsulasi pp3 = new MahasiswaEnkapsulasi(namaMhs,nimMhs,jrsnMhs,umurMhs,ipkMhs);
        pp3.tampildata();
        System.out.println("Status Kelulusan:"+pp3.statusKelulusan());
        System.out.print("Jumlah Objek:"+MahasiswaEnkapsulasi.getJumlahObjek());
    }
}
       
     
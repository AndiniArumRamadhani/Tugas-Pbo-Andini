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
public class MainAkunBankEnkakulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    akunbank pp1 = new akunbank();
    pp1.setNama("Andini Cantik");
    pp1.setNoRekening("59.....");
    pp1.setSaldo(5000000);
    pp1.TampilkanData();
    
    System.out.println();
    Scanner input = new Scanner(System.in);
    System.out.print("\nMasukan Jumlah Deposit = ");
    double deposit = input.nextDouble();
    pp1.deposit(deposit);
    pp1.TampilkanData();
    System.out.print("\nMasukan Jumlah Withdraw =");
    double withdraw = input.nextDouble();
    pp1.withdraw(withdraw);
    pp1.TampilkanData();
    System.out.println();
    
    System.out.print("\nMasukan Jumlah Deposit = ");
    double depositt = input.nextDouble();
    System.out.print("Masukan Jumlah Withdraw =");
    withdraw = input.nextDouble();
    akunbank pp2 = new akunbank("59.....","Andini Cantik",5000000);
    pp2.deposit(depositt);
    pp2.withdraw(withdraw);
    pp2.TampilkanData();
        
    
    }
    
}
    
    

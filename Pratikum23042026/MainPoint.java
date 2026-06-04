/*
Nama: Andini Arum Ramadhani
Nim: 2501081007
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum23042026;

/**
 *
 * @author Andini arum karini
 */
public class MainPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Point Rin = new Point(1,2);
       System.out.println(Rin);
       
        Rin.setX(5);
        Rin.setY(4);
        System.out.println(Rin);
        System.out.println("X :"+Rin.getX());
        System.out.println("Y: "+Rin.getY());
        int[] xy = Rin.getXY();
        System.out.println("XY : (" + xy[0] + "," + xy[1] + ")"); 
             
   } 
}
    
    


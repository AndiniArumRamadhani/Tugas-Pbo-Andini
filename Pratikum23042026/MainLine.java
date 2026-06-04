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
public class MainLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    Point Rin = new Point(2,4);
    System.out.println(Rin);
     
    Line dummyLine = new Line(1, 2, 3, 4);
    System.out.println(dummyLine);
    dummyLine.setBeginXY(5,6);
    dummyLine.setEndXY(7,8);
     
    System.out.println("Line is: " + dummyLine);
    System.out.println("Begin Point: " + dummyLine.getBegin());
    System.out.println("End Point: " + dummyLine.getEnd());
    System.out.println("Begin X: " + dummyLine.getBegin().getX());
    System.out.println("Begin Y: " + dummyLine.getBegin().getY());
    System.out.println("End X: " + dummyLine.getEnd().getX());
    System.out.println("End Y: " + dummyLine.getEnd().getY());
    System.out.println("Length: " + dummyLine.getLength());
     

    }
}
    
    


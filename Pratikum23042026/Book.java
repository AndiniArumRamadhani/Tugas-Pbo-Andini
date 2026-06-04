/*
Nama: Andini Arum Ramadhani
Nim: 2501081007
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum23042026;

/**
 *
 * @author Andini arum karini
 */
public class Book {
    private  final String name;
    private  final Author Author;
    private double price;
    private int Qty;
    
    Book( String name, Author Author, double price, int Qty){
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.Qty = Qty;
    }
    public String getName(){
        return name;
    }
    public  Author getAuthor(){
        return Author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.Qty = qty;
    }
    public int getQty(){
        return Qty;
    }
    public String toString(){
        return "'"+name + "'by"+Author;
    }
    
}

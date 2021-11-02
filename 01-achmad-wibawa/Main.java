/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs3;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lkr = new Lingkaran();
        Segitiga s = new Segitiga();
        
        pp.panjang = 4;
        pp.lebar = 2;
        System.out.println("---------------------------------");
        pp.luas();
        pp.keliling();
        
        lkr.r = 8;
        System.out.println("---------------------------------");
        lkr.luas();
        lkr.keliling();
        
        s.alas = 5;
        s.tinggi = 10;
        System.out.println("---------------------------------");
        s.luas();
        s.keliling();
    }
}

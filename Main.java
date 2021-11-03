/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifier.relasiclass.inheritance1;

/**
 *
 * @author Aku
 */
public class Main {
    public static void main(String[] args) {
        
//        Lingkaran
        Lingkaran l = new Lingkaran();
        l.r = 7;
        
//        Persegi Panjang
        PersegiPanjang p = new PersegiPanjang();
        p.panjang = 4;
        p.lebar = 3;
        
//        Segitiga
        Segitiga s = new Segitiga();
        s.alas = 7;
        s.tinggi = 9;
        
//        Print
        System.out.println("Luas lingkaran: "+l.luas()
                + "\nLuas Persegi Panjang: "+p.luas()
                + "\nLuas Segitiga: "+s.luas());
    }
}

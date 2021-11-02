/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOJS6;

/**
 *
 * @author Chaidir Wiradhika
 */
public class Main {
    public static void main(String[] args) {
        PersegiPanjang prsgpnjg1 = new PersegiPanjang();
        Lingkaran lkr1 = new Lingkaran();
        Segitiga sgt1 = new Segitiga();

        prsgpnjg1.pjg = 10;
        prsgpnjg1.lbr = 5;
        System.out.println("1.");
        System.out.println("===============================");
        System.out.println("PANJANG: " + prsgpnjg1.pjg );
        System.out.println("LEBAR: " + prsgpnjg1.lbr );
        prsgpnjg1.luas();
        prsgpnjg1.keliling();
        System.out.println("===============================");
        System.out.println();

        sgt1.als = 5;
        sgt1.tngi = 10;
        System.out.println("2.");
        System.out.println("===============================");
        System.out.println("ALAS: " + sgt1.als );
        System.out.println("LEBAR: " + sgt1.tngi );
        sgt1.luas();
        sgt1.keliling();
        System.out.println("===============================");
        System.out.println();

        lkr1.r = 7;
        System.out.println("3.");
        System.out.println("===============================");
        System.out.println("JARI - JARI: " + lkr1.r);
        lkr1.luas();
        lkr1.keliling();
        System.out.println("===============================");
    }
}
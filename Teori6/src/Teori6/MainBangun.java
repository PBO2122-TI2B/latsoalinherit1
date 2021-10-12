/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori6;

/**
 *
 * @author SMK TELKOM
 */
public class MainBangun {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        PersegiPanjang pp = new PersegiPanjang();
        Segitiga s = new Segitiga();
        Lingkaran lk = new Lingkaran();
        
        pp.panjang = 20;
        pp.lebar = 10;
        
        s.alas = 10;
        s.tinggi = 5;
        
        lk.r = 28;
        
        bd.keliling();
        pp.keliling();
        s.keliling();
        lk.keliling();
        
        bd.luas();
        pp.luas();
        s.luas();
        lk.luas();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.inheritance;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        /*
        // instansiasi objek Persegi Panjang dan menginputkan value pada attribute-nya
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 17;
        pp.lebar = 3;
        
        // instansiasi objek Lingkaran dan menginputkan value pada attribute-nya
        Lingkaran l = new Lingkaran();
        l.r = 10;
        
        // instansiasi objek Segitiga dan menginputkan value pada attribute-nya
        Segitiga s = new Segitiga();
        s.alas = 7;
        s.tinggi = 24;
        */
        Scanner sc = new Scanner(System.in);
        Segitiga segi = new Segitiga();
        System.out.println("---MENGHITUNG LUAS DAN KELILING SEGITIGA---");
        System.out.println("Silahkan memasukkan alas dan segitiga");
        System.out.print("Alas  : ");
            float alas = sc.nextFloat();
        System.out.print("Tinggi  : ");
            float tinggi = sc.nextFloat();
            segi.alas = alas;
            segi.tinggi = tinggi;
        System.out.println("Silakan memilih menu penghitungan segitiga");
        System.out.println("1. Hitung Luas Segitiga");
        System.out.println("2. Hitung Keliling Segitiga");
        System.out.print("Pilih   : ");
        int pilih = sc.nextInt();
        switch (pilih)
        {
        case 1:
            segi.luas();
            break;
        case 2:
            segi.keliling();
            break;
        default:
            System.out.println("Maaf, pilihan Anda tidak ada dalam menu");
        }
        /*
        // mengakses method luas dan keliling
        pp.luas();
        pp.keliling();
        
        l.luas();
        l.keliling();
        
        s.luas();
        s.keliling();*/
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_amelia;

/**
 *
 * @author Amelia
 */
import java.util.Scanner;
public class Inheritance {
    public static void menu(){
        System.out.println("===MENU BANGUN DATAR===");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }
    public static void main(String[] args) {
        BangunDatar bangun = new BangunDatar();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lr = new Lingkaran();
        Segitiga sg = new Segitiga();
        
        Scanner sc = new Scanner(System.in);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("\nPERSEGI PANJANG");
                    System.out.print("Masukkan panjang: ");
                    pp.panjang = sc.nextFloat();
                    System.out.print("Masukkan lebar: ");
                    pp.lebar = sc.nextFloat();
                    pp.luas();
                    pp.keliling();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nLINGKARAN");
                    System.out.print("Masukkan jari-jari: ");
                    lr.r = sc.nextFloat();
                    lr.luas();
                    lr.keliling();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nSEGITIGA");
                    System.out.print("Masukkan alas: ");
                    sg.alas = sc.nextFloat();
                    System.out.print("Masukkan tinggi: ");
                    sg.tinggi = sc.nextFloat();
                    sg.luas();
                    sg.keliling();
                    System.out.println();
                    break;
            }
        }while(pilih !=4);
    }
}

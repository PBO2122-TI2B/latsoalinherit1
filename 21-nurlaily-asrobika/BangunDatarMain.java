/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bngndtr;

import java.util.Scanner;
/**
 *
 * @author Asus X453
 */
public class BangunDatarMain {
  public static void menu(){
        System.out.println("                               ");
        System.out.println("Masukkan menu yang di inginkan:");
        System.out.println("1. Hitung Segitiga");
        System.out.println("2. Hitung Persegi Panjang");
        System.out.println("3. Hitung Lingkaran");
        System.out.println("4. Keluar");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = 0, t =0;
        float p = 0, l =0;
        float r = 0, phi= 3.14f;
        
        Segitiga sgt = new Segitiga(a, t);
        PersegiPanjang p1 = new PersegiPanjang(p, l);
        Lingkaran li = new Lingkaran(r, phi);
        
        int Pilih;
        do{
            menu();
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1:
                    sgt.setSegitiga();
                    sgt.info();
                    break;
                    
                case 2:
                    p1.setPersegiPanjang();
                    p1.info();
                    break;
                
                case 3:
                    li.setLingkaran();
                    li.info();
                    break;                    
            }
        } while (Pilih != 4) ;
    }
}

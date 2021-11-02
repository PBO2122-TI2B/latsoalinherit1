/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String args[]){
        LingkaranNew l = new LingkaranNew(2,2);
        l.awal();
        l.setJari();
        l.Tampil();
        
        PersegiPanjangNew pp = new PersegiPanjangNew(1,1);
        pp.awal();
        pp.setPanjangLebar();
        pp.Tampil();
        
        SegitigaNew s = new SegitigaNew(1,1);
        s.awal();
        s.setAlasTinggi();
        s.Tampil();
    }
}

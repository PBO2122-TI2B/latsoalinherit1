package Inheritance;

public class Main {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        PersegiPanjang p = new PersegiPanjang();
        Segitiga s = new Segitiga();

        System.out.println("=============LINGKARAN================");
        l.setPhi(3.14);
        l.setR(5);
        System.out.println("Jari-Jari : "+l.getR());
        l.hitungLuas();
        l.hitungKeliling();
        System.out.println("");

        System.out.println("=================PERSEGI PANJANG=================");
        p.setPanjang(15);
        p.setLebar(10);
        System.out.println("Panjang : "+p.getPanjang());
        System.out.println("Lebar : "+p.getLebar());
        p.hitungLuas();
        p.hitungKeliling();
        System.out.println("");

        System.out.println("=============SEGITIGA=================");
        s.setAlas(5);
        s.setTinggi(3);
        s.setC(4);
        System.out.println("Alas : "+ s.getAlas());
        System.out.println("Tinggi: "+s.getTinggi());
        s.hitungLuas();
        s.hitungKeliling();
        System.out.println("");
    }
}

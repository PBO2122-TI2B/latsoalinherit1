package Inheritance;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang prsgpnjg1 = new PersegiPanjang();
        Lingkaran lkr1 = new Lingkaran();
        Segitiga sgt1 = new Segitiga();

        prsgpnjg1.panjang = 10;
        prsgpnjg1.lebar = 5;
        System.out.println("Panjang: " + prsgpnjg1.panjang );
        System.out.println("Lebar: " + prsgpnjg1.lebar );
        prsgpnjg1.luas();
        prsgpnjg1.keliling();

        System.out.println();

        sgt1.alas = 5;
        sgt1.tinggi = 10;
        System.out.println("Alas: " + sgt1.alas );
        System.out.println("Lebar: " + sgt1.tinggi );
        sgt1.luas();
        sgt1.keliling();

        System.out.println();

        lkr1.r = 7;
        System.out.println("Jari-jari: " + lkr1.r);
        lkr1.luas();
        lkr1.keliling();
    }
}

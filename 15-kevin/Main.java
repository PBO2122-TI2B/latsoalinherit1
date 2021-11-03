public class Main {
    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        
        Lingkaran l1 = new Lingkaran();
        l1.r = 15;
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 7;
        pp1.lebar = 5;
        
        Segitiga s1 = new Segitiga();
        s1.alas = 16;
        s1.tinggi = 5;

        System.out.println("Menghitung Luas dan Keliling:");
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("\nLingkaran:");
        l1.luas();
        l1.keliling();

        System.out.println("\nPersegi Panjang:");
        pp1.luas();
        pp1.keliling();

        System.out.println("\nSegitiga:");
        s1.luas();
        s1.keliling();
    }
}
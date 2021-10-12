public class Main {
    public static void main(String[] args) {

        BangunDatar bangunDatar = new BangunDatar();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 34;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 12;
        persegiPanjang.lebar = 7;

        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 24;
        mSegitiga.tinggi = 36;

        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("-----Lingkaran-----");
        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        System.out.println("-----Persegi Panjang-----");
        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        System.out.println("-----Segitiga-----");
        mSegitiga.luas();
        mSegitiga.keliling();
        System.out.println();
    }
}
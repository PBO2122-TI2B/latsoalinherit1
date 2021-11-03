public class Main {
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 8;
        persegipanjang.lebar = 4;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 10;

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 3;
        segitiga.tinggi = 4;

        System.out.println("------------------------------");
        bangundatar.luas();
        System.out.println("------------------------------");
        persegipanjang.luas();
        lingkaran.luas();
        segitiga.luas();

        System.out.println("------------------------------");
        bangundatar.keliling();
        System.out.println("------------------------------");
        persegipanjang.keliling();
        lingkaran.keliling();
        segitiga.keliling();
        System.out.println("------------------------------");
    }
}

//Adika Ahmad Hanif Nazhir
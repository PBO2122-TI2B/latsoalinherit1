public class Main {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.lebar = 5f;
        persegiPanjang.panjang = 10f;

        System.out.println("=======Persegi Panjang========");
        System.out.println("Panjang: " + persegiPanjang.panjang);
        System.out.println("Lebar: " + persegiPanjang.lebar);
        System.out.println("Keliling: " + persegiPanjang.keliling());
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 10f;

        System.out.println("=======Lingkaran========");
        System.out.println("Jari-jari: " + lingkaran.r);
        System.out.println("Keliling: " + lingkaran.keliling());
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println();

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 3;
        segitiga.tinggi = 4;

        System.out.println("=======Segitiga========");
        System.out.println("Alas: " + segitiga.alas);
        System.out.println("Tinggi: " + segitiga.tinggi);
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}

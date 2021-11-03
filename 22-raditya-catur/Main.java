package bangundatar;

public class Main {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.r = 14;

        PersegiPanjang p1 = new PersegiPanjang();
        p1.lebar = 10;
        p1.panjang = 5;

        Segitiga s1 = new Segitiga();
        s1.alas = 4;
        s1.tinggi = 8;

        l1.hitungLuas();
        l1.hitungKeliling();

        p1.hitungLuas();
        p1.hitungKeliling();

        s1.hitungLuas();
        s1.hitungKeliling();
    }
}

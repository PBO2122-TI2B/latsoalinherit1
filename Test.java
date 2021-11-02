package bangun_datar;

public class Test {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang(3, 5);
        p.info();
        p.hitungLuas();
        p.hitungKeliling();

        System.out.println();

        Lingkaran l = new Lingkaran(7);
        l.info();
        l.hitungLuas();
        l.hitungKeliling();

        System.out.println();

        Segitiga s = new Segitiga(4, 3);
        s.hitungSisiMiring();
        s.info();
        s.hitungLuas();
        s.hitungKeliling();
    }
}

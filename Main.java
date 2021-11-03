public class Main {
    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 15;
        
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 20;
        mSegitiga.tinggi = 10;
        
        lingkaran ling = new lingkaran();
        ling.r = 7;
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        ling.luas();
        ling.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
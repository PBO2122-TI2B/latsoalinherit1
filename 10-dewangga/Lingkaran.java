package bangun_datar;

public class Lingkaran extends BangunDatar {
    private float r;

    Lingkaran(float r){
        this.r = r;
    }
    public void setJari(float r) {
        this.r = r;
    }
    public float getJari(){
        return r;
    }
    public void info() {
        System.out.println("Jari-jari Lingkaran = " + getJari());
    }
    public void hitungLuas() {
        float phi = 3.14f;
        super.luas = phi*r*r;
        System.out.println("Luas Lingkaran = " + super.luas);
    }
    public void hitungKeliling() {
        float phi = 3.14f;
        super.keliling = 2*phi*r;
        System.out.println("Keliling Lingkaran = " + super.keliling);
    }
}

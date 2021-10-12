package bangun_datar;
public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisiMiring;

    Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void setAlas(float alas) {
        this.alas = alas;
    }
    public float getAlas(){
        return alas;
    }
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    public float getTinggi(){
        return tinggi;
    }
    public void info() {
        System.out.println("Alas Segitiga = " + getAlas());
        System.out.println("Tinggi Segitiga = " + getTinggi());
        System.out.println("Sisi Miring Segitiga = " + sisiMiring);
    }
    public void hitungLuas() {
        super.luas = 0.5f *alas*tinggi;
        System.out.println("Luas Segitiga = " + super.luas);
    }
    public void hitungKeliling() {
        super.keliling = alas+tinggi+sisiMiring;
        System.out.println("Keliling Segitiga = " + super.keliling);
    }
    public float hitungSisiMiring(){
        sisiMiring = (float)Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        return sisiMiring;
    }
}

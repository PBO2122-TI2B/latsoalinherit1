package bangun_datar;

public class PersegiPanjang extends BangunDatar{
    private float panjang;
    private float lebar;

    PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
    public float getPanjang(){
        return panjang;
    }
    public void setLebar(float lebar) {
        this.lebar = lebar;
    }
    public float getLebar(){
        return lebar;
    }
    public void info() {
        System.out.println("Panjang = " + getPanjang());
        System.out.println("Lebar = " + getLebar());
    }
    public void hitungLuas() {
        super.luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang = " + super.luas);
    }
    public void hitungKeliling() {
        super.keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang = " + super.keliling);
    }
}    

package Inheritance;

public class PersegiPanjang extends Persegi{
    private int panjang, lebar;

    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int hitungLuas(){
        super.Luas();
        int luas = panjang * lebar;
        System.out.print(luas);
        return luas;
    }
    public int hitungKeliling(){
        super.Keliling();
        int keliling = 2 * (panjang + lebar);
        System.out.print(keliling);
        return keliling;
    }
}
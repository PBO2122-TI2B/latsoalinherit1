package Inheritance;

public class Segitiga extends BangunDatar{
    private double alas, tinggi, c;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getC() {
        return c;
    }

    public double hitungLuas(){
        super.Luas();
        double luas =   0.5 * (alas * tinggi);
        System.out.print(luas);
        return luas;
    }
    public double hitungKeliling(){
        super.Keliling();
        double keliling = alas+tinggi+c;
        System.out.print(keliling);
        return keliling;
    }
}

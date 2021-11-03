package Inheritance;

public class Lingkaran extends BangunDatar{

    private double phi;
    private double r;

    public void setPhi(double phi){
            this.phi = phi;
    }
    public double getPhi(){
            return phi;
    }
    public void setR(double r){
            this.r = r;
    }
    public double getR(){
            return r;
    }
    public double hitungLuas(){
        super.Luas();
        double luas = phi * (r*r);
        System.out.print(luas);
        return luas;
    }
    public double hitungKeliling(){
        super.Keliling();
        double keliling = 2 * phi * r;
        System.out.print(keliling);
        return keliling;
    }
}

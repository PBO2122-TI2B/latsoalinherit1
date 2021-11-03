public class Segitiga extends BangunDatar {
  float alas;
  float tinggi;

  public void setSegitiga(float a, float t) {
    alas = a;
    tinggi = t;
  }
  
  @Override
  float luas(){
      float luas = (float) 0.5 * (alas * tinggi);
      System.out.println("Luas Segitiga : " + luas);
      return luas;
  }
    
  @Override
  float keliling(){
      float sisiMiring = (float) Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2) );
      float keliling = (alas + sisiMiring + tinggi);
      System.out.println("Keliling Siku-Siku: " + keliling);
      return keliling;
  }
}
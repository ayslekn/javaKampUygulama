public class Main {
    public static void main(String[] args)
    {
      DortIslem dortIslem=new DortIslem();//referans
      int sonuc= dortIslem.Topla(3,4);
      int sonuc2= dortIslem.Carp(3,8);
      System.out.println(sonuc);
      System.out.println(sonuc2);
    }
}
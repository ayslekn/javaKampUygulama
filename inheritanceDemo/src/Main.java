public class Main {
    public static void main(String[] args)
    {
        //polimorfizm oluyor aslında
        KrediUI krediUI =new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
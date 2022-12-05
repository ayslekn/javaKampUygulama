public class Main {
    public static void main(String[] args) //proje mainden dallanır main bir metoddur
    {
        sayiBulmaca();  //aynı classın içindeki metodu çağırdık

    }
//camel casing metod yazılışları deve görüntüsü
    //class pascal casing
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;


        for (int sayi : sayilar) //dizinin bütün elemanlarını geziyor
        {
            if (sayi == aranacak) {
                //System.out.println("sayı mevcuttur."); veya
                varMi = true;
                break;
            }
        }
        String mesaj;
        if (varMi) {
            mesaj="sayı mevcuttur:"+aranacak;
            mesajVer(mesaj);
        } else {
            System.out.println("sayı mevcut değildir:"+aranacak);
        }}
        public static void mesajVer (String mesaj) {
            {
                System.out.println(mesaj);
            }

        }}
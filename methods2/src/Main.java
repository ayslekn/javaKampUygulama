public class Main {
    public static void main(String[] args)
    {
        String mesaj="Bugün hava çok güzel";
       String yeniMesaj=sehirVer();
       System.out.println(yeniMesaj);
        int sayi=topla(5,7);
        System.out.println(sayi);
        int toplam=topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }
    public static void ekle(){
        System.out.println("eklendi");
    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void guncelle(){
        System.out.println("güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2 ;
    }
    public static int topla2(int...sayilar)
    //birden fazla int göndermek için ... kullanılır
    {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam; //bitir ve toplamı döndür demek
    }


    public static String sehirVer(){
        return "Ankara";
    }
}

//atamış olduk, substring bir değer döndürdü
//void ile  bir işi yap dersin emir gibi
// substring birşey oluşturdu bize sonuç olarak verdi ama void bize sonuç olarak vermez
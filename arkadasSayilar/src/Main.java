public class Main
{
    public static void main(String[] args)
    {
        //220-284
        // 220 sayısının bölenlerinin toplamları 284 sayısına eşit ve 284 sayısının bölenleri toplamı 220 ye eşit


        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        for(int i=1;i<sayi1;i++)
        {   if(sayi1%i==0)
        {    toplam1=toplam1+i;}

    }
        for(int i=1;i<sayi2;i++)
        {   if(sayi2%i==0)
        {    toplam2=toplam2+i;}

        }
        if(sayi1==toplam2 && sayi2==toplam1) // && işareti ve demek || işaret ikisinden biri demek
        { System.out.println("bu iki sayı arkadaştır");
}
        else{ System.out.println("bu iki sayı arkadaş değildir");}
}}
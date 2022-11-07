public class Main
{
    public static void main(String[] args)
    {
        int number=1;
        int remainder=number%2;  //sayının iki ile bölümünden kalanı verir
        System.out.println(remainder);

        boolean isPrime=true; //isprime =asal anlamı var sayıyı en başta asal seçiyoruz.
         if(number<1)
         {  System.out.println("geçersiz sayı girdiniz.");}
         if(number==1)
         {
             System.out.println("sayı asal değil");
             return;
         }

        for(int i=2;i<number;i++)
        {
            if(number%i==0) // sayı i sayısına tam bölünüyorsa false yani asal değil
            {
                isPrime=false;
        }
        }
            if(isPrime)   // parantez içi isPrime==True ile aynı
            {
                System.out.println("sayı asaldır");
            }
            else {
                System.out.println("sayı asal değildir");
            }


    }
}
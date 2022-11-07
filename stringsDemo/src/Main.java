public class Main {
    public static void main(String[] args)
    {
        String mesaj="    Bugün hava çok güzel.   ";
        System.out.println(mesaj);
        /*System.out.println("eleman sayısı="+mesaj.length()); //dizinin elaman sayısı
        System.out.println("5.eleman="+mesaj.charAt(4)); //dizinin 5.elemanı bulduran
        System.out.println(mesaj.concat("yaşasın!")); //mesajı birleştirmek
        System.out.println(mesaj.startsWith("A")); //mesajın hangi harfle başladığı
        System.out.println(mesaj.endsWith(".")); //mesajın sonu hangi harf ile bitiyor
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);//bu aralıkta olan karakterleri yazdırır.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a")); // mesajın içinde a karakterinin yerini söyler soldan
        System.out.println(mesaj.lastIndexOf("a")); //aramaya mesajın  sonundan başlar sağdan*/

        System.out.println(mesaj.replace(" ","-")) ;//replace değiştirmek anlamına geliyor

        String yeniMesaj=mesaj.replace(" ","-") ;//yeni bir değişkene atayıp kullanmak için
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2)); //mesajın baştan itibaren 2.karaktere kadar olan kısmı parçala
        System.out.println(mesaj.substring(2,5)); //mesajın baştan 2 ile 5 arasını alır

        for(String kelime: mesaj.split(" ")) //kelimeleri alt alta yazar
        {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); //küçük harf demek mesajı küçük harfe çevirir
        System.out.println(mesaj.toUpperCase());// bütün mesajı büyük harfler ile yazar.
        System.out.println(mesaj.trim());//mesajın başındaki ve sonundaki boşlukları siler.




    }
}
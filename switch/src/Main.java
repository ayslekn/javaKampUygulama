public class Main {
    public static void main(String[] args)
    {
       char grade='A';
       switch (grade) {
           case 'A':
         System.out.println("Mükemmel:geçtiniz!");
         break;
           case 'B':
               System.out.println("Çok güzel:geçtiniz.");
               break;
           case'C':
               System.out.println("iyi:geçtiniz.");
               break;
           case'D':
               System.out.println("fena değil:geçtiniz.");
               break;
           case'F':
               System.out.println("kötü:kaldınız.");
               break;
           default:
               System.out.println("Geçersiz not girdiniz.");


       }

    }
}
public class Main {
    public static void main(String[] args) {
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
        if (varMi) {
            System.out.println("sayı mevcuttur.");

        }
        else{
            System.out.println("sayı mevcut değildir.");
    }

    }
}
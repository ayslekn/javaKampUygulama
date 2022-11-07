public class Main {
    public static void main(String[] args)
    {
        //for
        // i++ ile i=i+1 aynı
        // i+=2 i yi iki iki artır demek
        for(int i=2;i<=10;i+=2) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti!");


        int i=1;
        //while
        while(i<10)
        {
            System.out.println(i);
            i++; //i+=2 de olabilir
        }
        System.out.println("while döngüsü bitti");

        //do while döngüsü
        int j=1;
        do {
            System.out.println(j);
            j += 2;

        }
        while (j<10);
        System.out.println("do while döngüsü bitti");


    }
}
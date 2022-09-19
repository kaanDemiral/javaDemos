public class Main {

    public static void main(String[] args) {
        int mukSayi = 17;
        int total = 0;
        for (int i = 1; i < mukSayi; i++ ){
            if (mukSayi % i == 0){
                total += i;

            }


        }
        if (total == mukSayi){
            System.out.println("Mükemmel sayıdır.");

        }else{
            System.out.println("Mükemmel Sayı değildir.");
        }



    }
}

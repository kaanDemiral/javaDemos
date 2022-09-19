public class Main {

    public static void main(String[] args) {

        int number = 4;
        int remainder = number % 2;
        boolean isPrime = true;


        if (number < 1){
            System.out.println("Geçersiz");
            return;
        }

        if (number == 1){
            System.out.println("sayı asal değildir");
            return;
        }

        for (int i = 2; i < number; i++ ){
            if (number % i == 0){
                isPrime = false;

            }


        }
        if (isPrime){
            System.out.println("Sayı asaldır.");

        }else {
            System.out.println("Asal sayı değildir.");
        }




    }
}

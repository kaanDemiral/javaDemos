public class Main {

    public static void main(String[] args) {

        int[] myList = {1, 5, 8, 2};
        int total = 0;
        int max = 0;
        for (int number:myList){

            if (max<number){
                max = number;
            }

            total = total + number;
            System.out.println(number+"en büyük sayı ="+max);





        }

        System.out.println(total + "toplam");





      System.out.println("--------------------------");




      String[][] sehirler = new String[3][4];

        sehirler[0][0] = "Ankara";
        sehirler[0][1] = "Kayseri";
        sehirler[0][3] = "Marmara";
        sehirler[0][2] = "Afyonkarahisar";
        sehirler[1][0] = "İstanbul";
        sehirler[1][1] = "Bursa";
        sehirler[1][2] = "Bilecik";
        sehirler[1][3] = "Marmara";
        sehirler[2][0] = "Antalya";
        sehirler[2][1] = "Mersin";
        sehirler[2][2] = "Adana";
        sehirler[2][3] = "Akdeniz";

        for (int i = 0; i<=2;i++){
            System.out.println("----------------");
            for (int j = 0; j<=3;j++){

                System.out.println(sehirler[i][j]);
            }



        }


















    }
}

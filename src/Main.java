public class Main {

    public static void main(String[] args) {
        //bölgelerdeki şehirleri yazdırma
        String[][] sehirler = new String[3][4];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Yalova";
        sehirler[0][2] = "Sakarya";
        sehirler[0][3] = "Kocaeli";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Manisa";
        sehirler[1][2] = "Denizli";
        sehirler[1][3] = "Aydın";
        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Konya";
        sehirler[2][2] = "Eskişehir";
        sehirler[2][3] = "Kayseri";

        for (int i = 0; i <= 2; i++) {
            switch (i) {
                case 0:
                    System.out.println("Marmara");
                    break;
                case 1:
                    System.out.println("Ege");
                    break;
                case 2:
                    System.out.println("İçanadolu");
                    break;


            }

            for (int j = 0; j < 4; j++) {
                System.out.println(sehirler[i][j]);

            }
            System.out.println("-----------");

        }System.out.println("Bölgeler Bitti");
    }


}

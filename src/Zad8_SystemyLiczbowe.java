import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 14.12.2019
 */
final class Zad8_SystemyLiczbowe {
    public static void main(String[] args) {
        //Najczęstsze:
        // dwójkowy: wartości 0-1
        // ósemkowy: wartości 0-7
        // dziesiętny: wartości 0-9
        // szesnastkowy: wartości 0-9 i A-F

        // Zad 1
        // (10) -> (2)

//        int a = 700;
//
//        List<Integer> reszty = new ArrayList<>(50);
//        int x = 0;
//
//        while (x >= 0){
//            x = a % 2;
//            int z = Math.floorDiv(a, 2);
//            reszty.add(x);
//            a = z;
//            if (a == 0){
//                break;
//            }
//        }
//        Collections.reverse(reszty);
//        System.out.println(reszty.toString());


        int liczba = 14;

        String str = "";
        while (liczba > 0) {
            str = liczba % 2 + str;
            liczba /= 2;
        }
        System.out.println(str);


        // Zad 2 (2) -> (10)

        String liczba2 = String.valueOf(1110);
        int liczba3 = 0;

        for (int i = liczba2.length() - 1; i >= 0; i--) {
            int x = liczba2.length() - 1 - i;
            if (liczba2.charAt(i) == '1')
                liczba3 = liczba3 + ((int) Math.pow(2, x) * 1);

        }
        System.out.println(liczba3);

        // Zad 3 (8) -> (16) . A tak na prawdę (8) -> (10) -> (16)

        String liczbaOct = String.valueOf(3452);
        int liczbaDec = 0;  // oczekiwana = 1834;
        String liczbaHex = " ";

        for (int i = liczbaOct.length() - 1; i >= 0; i--) {
            int x = liczbaOct.length() - 1 - i;
            int a = (int) Math.pow(8, x);
            int b = liczbaOct.charAt(i) - '0';
            if (b != 0)
                liczbaDec = liczbaDec + a * b;
        }
        System.out.println(liczbaDec);

        String a = String.valueOf(liczbaHex);

        while (liczbaDec > 0) {
            switch (a) {
                case "10":
                    liczbaHex = "A";
                case "11":
                    liczbaHex = "B";
                case "12":
                    liczbaHex = "C";
                case "13":
                    liczbaHex = "D";
                case "14":
                    liczbaHex = "E";
                case "15":
                    liczbaHex = "F";
                case "16":
                    liczbaHex = "G";
            }
            liczbaHex = liczbaDec % 16 + liczbaHex;
            liczbaDec /= 16;
        }
        System.out.println(liczbaHex);


        // Zad 4 - tabelka - piramidka

        int n = 5;
        int o = 5;
        int[][] zadanie = new int[n][o];

        for (n = 0; n < zadanie.length; n++) {
            for (o = 0; o < zadanie.length; o++) {
                int x = zadanie.length - n;
                int y = zadanie.length - o;
                zadanie[n][o] = Math.min(Math.min(x, y), Math.min(o + 1, n + 1));
                System.out.print(zadanie[n][o] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        // Zad 5 - tabelka XOXO

        int i = 5;
        int j = 5;
        String[][] zadanie5 = new String[i][j];

        for (i = 0; i < zadanie5.length; i++) {
            for (j = 0; j < zadanie5.length; j++) {
             /*   if (i % 2 == 0 && j % 2 == 0) {
                    zadanie5[i][j] = String.valueOf('X');
                } else if (i % 2 != 0 && j % 2 == 0) {
                    zadanie5[i][j] = String.valueOf('0');
                } else if (i % 2 == 0 && j % 2 != 0) {
                    zadanie5[i][j] = String.valueOf('O');
                } else
                    zadanie5[i][j] = String.valueOf('X'); */
                if ((i + j) % 2 == 0) {
                    zadanie5[i][j] = String.valueOf('X');
                } else
                    zadanie5[i][j] = String.valueOf('O');
                System.out.print(zadanie5[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");


    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 08.12.2019
 */
final class Zad4_TablicaAmplituda {
    public static void main(String[] args) {


        // Dagmara
        int [] liczby = new int[5];
        liczby[0] = 9;
        liczby[1] = 4;
        liczby[2] = 20;
        liczby[3] = 5;
        liczby[4] = 1;

        Arrays.sort(liczby);
        System.out.println("po sortowaniu: " + Arrays.toString(liczby));

        int min = liczby[0];
        int max = liczby[liczby.length-1];

        int difference = max - min;

        System.out.println("difference is: " + difference);

        // Piotr

        int[] liczba = {3, 7, 8, 8, 0, 2};

        int min1 = liczba[0];
        int max1 = liczba[0];

        for (int i =1; i < liczba.length; i++){
            if(liczba[i] < min)
                min = liczba[1];
            if(liczba[i] > min)
                max = liczba[i];
        }
        System.out.println(max - min);






    }
}

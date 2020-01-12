import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 15.12.2019
 */
final class Zad8_KontynuacjaWeekend2 {
    public static void main(String[] args) {

        // Zad 6 - Do metody dostarcz 2-wymiarową tablicę,
        // następnie zwróć element który występuje w niej największą ilość razy.

        int[][] tab = {{4, 2, 1}, {3, 1, 1}, {5, 8, 1}};

        ArrayList<Integer> wartosciBezPowtorzen = new ArrayList<Integer>();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (!wartosciBezPowtorzen.contains(tab[i][j]))
                    wartosciBezPowtorzen.add(tab[i][j]);
            }
        }

        ArrayList<Integer> wystapienia = new ArrayList<Integer>();
        for (int i = 0; i < wartosciBezPowtorzen.size(); i++)
            wystapienia.add(0);

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int index = wartosciBezPowtorzen.indexOf(tab[i][j]);
                int value = wystapienia.get(index);
                value++;
                wystapienia.set(index, value);
            }
        }

        System.out.println(wartosciBezPowtorzen);
        System.out.println(wystapienia);

        int idx = wystapienia.indexOf(Collections.max(wystapienia));

        System.out.println(idx);
        System.out.println("Odpowiedz: " + wartosciBezPowtorzen.get(idx));

        // Zad 7  Napisz metodę która dla kwadratowej 2- wymiarowej tablicy
        // zwróci kolumne w ktorej suma elementów jest największa

        int sumColumns = 0;

        int[][] tablica = {
                {4, 5, 6, 2},
                {5, 3, 7, 8},
                {7, 7, 8, 3,},
                {1, 2, 3, 4}};


        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                sumColumns = sumColumns + tablica[i][j];
                if (j == tablica[i].length - 1) {
                    sumColumns = 0;
                    break;
                }
            }
            System.out.println(sumColumns);
        }


        // Bubble sort dla 1-wymiarowej tablicy

        int[] tablica2 = {3, 6, 1, 8, 7, 9};


        boolean check = true;

        while (check) {
            check = false;
            int idx2 = 0;
            while (idx2 < tablica2.length - 1) {
                if (tablica2[idx2] > tablica2[idx2 + 1]) {
                    int y = tablica2[idx2 + 1];
                    int z = tablica2[idx2];
                    tablica2[idx2] = y;
                    tablica2[idx2 + 1] = z;
                    check = true;
                }
                idx2++;
                System.out.println(Arrays.toString(tablica2));
            }
        }
        System.out.println();


        // Bubble sort dla 2-wymiarowej tablicy;

        int[][] tablica3 =
                {{8, 7, 3, 2},
                        {5, 3, 4, 0},
                        {2, 1, 9, 6},
                        {5, 6, 2, 9}};


        boolean warunek = true;

        while (warunek) {
            warunek = false;
            for (int i = 0; i <= tablica3.length - 1; i++) {
                for (int j = 0; j <= tablica3[i].length - 1; j++) {
                    if (i < tablica3.length - 1 && tablica3[i][j] > tablica3[i + 1][j]) {
                        int y = tablica3[i + 1][j];
                        int z = tablica3[i][j];
                        tablica3[i][j] = y;
                        tablica3[i + 1][j] = z;
                        warunek = true;
                    } else if (j < tablica3[i].length - 1 && tablica3[i][j] > tablica3[i][j + 1]) {
                        int y = tablica3[i][j + 1];
                        int z = tablica3[i][j];
                        tablica3[i][j] = y;
                        tablica3[i][j + 1] = z;
                        warunek = true;
                    }
                    System.out.print(tablica3[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

        //Zad 7. Zaproponuj algorytm możliwie najszybszy do zliczenia ilości ujemnych wartości w tablicy posortowanej z Zad 6.

        int[][] tablica4 = {{0, -1, 2, 4}, {5, 8, 3, 1}, {-1, -6, 4, -4}, {0, -9, -5, 3}};
        ArrayList<Integer> ujemne = new ArrayList<Integer>();

        for (int i = 0; i < tablica4.length; i++) {
            for (int j = 0; j < tablica4[i].length; j++) {
                if (tablica4[i][j] < 0) {
                    ujemne.add(tablica4[i][j]);
                }
            }
        }
        System.out.println(ujemne.size());

        //Zad 8. Zaimplementuj Insertion Sort (edited)

        int[] tablica5 = {8, 4, 3, 6, 1, 7, 4, 0, 4, 6, 6, 7};
        int przechowanie = 0;


        for (int i = 1; i < tablica5.length; i++) {
            for (int j = i; j > 0; j--) {
                if (tablica5[j] < tablica5[j - 1]) {
                    przechowanie = tablica5[j];
                    tablica5[j] = tablica5[j - 1];
                    tablica5[j - 1] = przechowanie;
                }
            }
        }
        System.out.println(Arrays.toString(tablica5));

        //Zad 9. Zaimplementuj Counting Sort

        int[] tablica6 = {1, 4, 1, 2, 7, 5, 2};
        Arrays.sort(tablica6);
        System.out.println(Arrays.toString(tablica6));
        ArrayList<Integer> wartoscibezpowt = new ArrayList<>();

        for (int i = 0; i < tablica6.length; i++) {
            if (!wartoscibezpowt.contains(tablica6[i])) {
                wartoscibezpowt.add(tablica6[i]);
            }
        }
        System.out.println(wartoscibezpowt);
        int b = wartoscibezpowt.get(wartoscibezpowt.size() - 1);
        int[] czestosc = new int[b+1];

        for (int i = 0; i < tablica6.length; i++) {
            czestosc[tablica6[i]]++;
        }
        System.out.println(Arrays.toString(czestosc));
        int[] czestosc2 = czestosc.clone();

        for (int i = 0; i < czestosc.length ; i++) {
            for (int j = 0; j < i ; j++) {
                czestosc2[i] = czestosc2[i]+czestosc[j];
            }
        }
        System.out.println(Arrays.toString(czestosc2));

        // Zad 10 BINARY SEARCH

        int[] table = {3,7,9,1,2,4,6,8,5};
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
        int searched = 7;
        int middleValue = 0;
        int middleIndex = 0;
        int min = 0;
        int max = table.length-1;

        while (min <= max){
            middleIndex = (min+max)/2;
            middleValue = table[middleIndex];
            if(middleValue == searched){
                System.out.println("Given value at index: " + middleIndex);
                break;
            }
            if (middleValue > searched){
                max = middleIndex-1;
            }
            else
                min = middleIndex+1;
        }

    }
}

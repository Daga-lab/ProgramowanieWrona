import java.util.Arrays;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 08.12.2019
 */
final class Zad5_ZadaniaTablice {
    public static void main(String[] args) {

        int[] tab1 = {4, 3, 2, 1};
        int[] tab2 = {1, 2, 3, 4};

        // Zad 1 Wyśiwetl komunikat jeśli obie tablice zawierają takie same elementy

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        if (Arrays.equals(tab1, tab2) == true) {
            System.out.println("Tablice zawierają takie same elementy");
        } else
            System.out.println("Tablice się różnią");


        // Zad 2 Czy wszystie liczby z tab1 zawierają się w tab2
        // rozwiązanie z sortowaniem

        boolean czyTakieSame = true;

        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i])
                czyTakieSame = false;
        }

        System.out.println(czyTakieSame ? "Takie same" : "Nie takie same");

        // rozwiązanie bez sortowania


        for (int i = 0; i < tab1.length; i++) {
            boolean czyZawieraSię = false;
            for (int j = 0; j < tab2.length; j++)
                if (tab1[i] == tab2[j])
                    czyZawieraSię = true;

            if (!czyZawieraSię)
                czyTakieSame = false;

        }
        System.out.println(czyTakieSame ? "Takie same" : "Nie takie same");


        // odwrotnie = czy druga zawiera się w pierwszej

        for (int i = 0; i < tab2.length; i++) {
            boolean czyZawieraSię = false;
            for (int j = 0; j < tab1.length; j++)
                if (tab2[i] == tab1[j])
                    czyZawieraSię = true;

            if (!czyZawieraSię)
                czyTakieSame = false;

        }
        System.out.println(czyTakieSame ? "Takie same" : "Nie takie same");

        // Zad 3

        int[] tab3 = {0, 3, -2, 1, -6, 7, 8, 9, -1, -7};
        int[] tab4 = {-6, 7, -1};


        int x = 0;
        int y = 0;
        boolean zawieraSię = true;


        for (x = 0; x < tab4.length; x++) {
            boolean czyTakieSame1 = false;
            for (y = 0; y < tab3.length; y++)
                if (tab4[x] == tab3[y])
                    czyTakieSame1 = true;

            if (!czyTakieSame1)
                zawieraSię = false;
        }
        System.out.println((zawieraSię) ? "Zawiera się" : "Nie zawiera się");

        //Zad 4 wypisz indeks od którego podciąg B zawiera się z podciągu A lub -1 jeśli nie zawiera się
        // bez wykorzystania klasy arrays

        int[] tab7 = {0, 3, -2, 1, -6, -1, 8, 9, -1, -7};
        int[] tab8 = {-6, -1, 8};

        int idx = 0;
        int wynik = -1;

        for (int i = 0; idx < tab8.length && i < tab7.length; i++) {
            if (tab7[i] == tab8[idx]) {
                idx++;
                if (idx == tab8.length - 1) {
                    wynik = i;
                } else {
                    idx = 0;
                    wynik = -1;
                }
            }
            System.out.println(wynik);
        }

        // Z wykorzystaniem klasy arrays
        // Arrays.binarySearch(tablica, szukanyElement)

        int[] tab9 = {0, 3, -2, 1, -6, -1, 8, 9, -1, -7};
        int[] tab10 = {-6, -1, 8};

        int jeden = Arrays.binarySearch(tab9, tab10[0]);
        int dwa = Arrays.binarySearch(tab9, tab10[1]);
        int trzy = Arrays.binarySearch(tab9, tab10[2]);

        if (trzy == dwa + 1 && dwa == jeden + 1) {
            System.out.println(jeden);
        } else
            System.out.println(-1);


        // Zad 5. Napisz samodzielnie mechanizm sumowania dwóch tablic o rożnym rozmiarze ( {3,4,2,5} + {1,2} = {4,6,2,5})

        int[] tab11 = {3, 4, 2, 5, 1};
        int[] tab12 = {1, 2, 1};
        int index = 0;


        while (tab11.length > tab12.length) {
            int value1 = tab11[index];
            int value2 = tab12[index];
            tab11[index] = value1 + value2;
            index++;
            if (index >= tab12.length) {
                tab11[index] = tab11[index];
                break;
            } else if (index >= tab11.length) {
                break;
            }
        }
        System.out.println(Arrays.toString(tab11));


        // Zad 6. Odwróć porządek w tablicy jednowymiarowej

        int[] tab13 = {1, 2, 3, 4, 5, 6};
        int index2 = 0;
        int zmiennaZPoczątku = 0;
        int zmiennaZKOńca = 0;

        while (index2 <= tab13.length / 2) {
            zmiennaZPoczątku = tab13[index2];
            zmiennaZKOńca = tab13[tab13.length - (1 + index2)];
            tab13[index2] = zmiennaZKOńca;
            tab13[tab13.length - (1 + index2)] = zmiennaZPoczątku;
            index2++;
        }
        System.out.println(Arrays.toString(tab13));

        // Zad 7 Napisz tablicę wielowymiarową i wypisz wektor sum elementów w wierszu

        int[][] tabWW = {{8, 9, 10}, {2, 3, 4}, {7, 5, 2}};
        int[] tabWektor = new int[3];
        x= 0;
        int z = 0;
        int p = 0;
        int s = 0;


     /*   tabWektor[x+0] = tabWW[x+0][z+0] + tabWW[x+0][z+1] + tabWW[x+0][z+2];
        tabWektor[x+1] = tabWW[x+1][z+0] + tabWW[x+1][z+1] + tabWW[x+1][z+2];
        tabWektor[x+2] = tabWW[x+2][z+0]+ tabWW[x+2][z+1]+ tabWW[x+2][z+2];

        System.out.println(Arrays.toString(tabWektor)); */

        for (p=0; p<=2; p++){
            for (s=0; s<=2; s++){
                tabWektor[x+p] += tabWW[x+p][z+s];
            }
        }
        System.out.println(Arrays.toString(tabWektor));


        // Zad 8 Napisz tablicę dwuwymiarową i wypisz wektor sum elementów w kolumnie


        int[][] tabW2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [] tabWektor2 = new int[3];

        for(s=0; s<=2; s++){
            for(p=0; p<=2; p++){
                tabWektor2[z+s] += tabW2[x+p][z+s];
            }
        }
        System.out.println(Arrays.toString(tabWektor2));
    }
}

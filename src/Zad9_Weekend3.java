import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 11.01.2020
 */
final class Zad9_Weekend3 {
    public static void main(String[] args) {

        // Zad 1 Przez instytut medyczny zostales poproszony, o przygotowanie programu,
        // który dla odczytanych próbek (gestosci wystapienia skupisk choroby),
        // znajdzie epicentra 'Stwardnienia bocznego',
        //a nastepnie okresli idealne miejsca naciec chirurgicznych.
        //Przez epicentruum rozumie sie próbke, którego dwie sasiadujace z nia próbki
        // maja nizsze wskazanie gestosci wystapienia. Za epicentrum nie moze byc uznana pierwsza, ani ostatnia próbka.
        //W zaleznosci od stanu zdrowia pacjenta mozna dokonac okreslonej ilosci naciec chirurgicznych'
        // oraz zaklada sie, ze kazde kolejne naciecie nie moze byc zrobione blizej niz poprzednie.
        //Odpowiedzia do zadania jest ilosc naciec chirurgicznych, które moga zostac wykonane.

        int[] table1 = {1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1};
        int max = 4;
        int count = 0;
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 1; i < table1.length - 1; i++) {
            if (table1[i - 1] < table1[i] && table1[i + 1] < table1[i]) {
                count = 1;
                index.add(i);
                System.out.println(index);
            }
            for (int j = 2; j < index.size() - 1; j++) {
                if (index.get(1) - index.get(0) <= index.get(j + 1) - index.get(j)) {
                    count++;
                } else if (index.get(1) != 0) {
                    count = count + 1;
                }
            }
        }
        if (count > max) {
            System.out.println("Avaliable cuts: " + max);
        } else
            System.out.println("Avaliable cuts: " + count);



   /*     Integer[] table2 = {null};
        Scanner question = new Scanner(System.in);
        System.out.println("Provide number to add or Stop");
        String choice = question.nextLine();*/

      /*  if (!choice.equals("Stop")){
            Integer liczba = Integer.parseInt(choice);
            for (int i = 0; i < table2.length; i++) {
                if (table2[i] == null){
                    table2[i] = liczba;
                }
                if (table2.length < i){
                    int j = 0;
                    Integer [] table3 = new Integer[table2.length+j];
                    for (j = 0; j <= 2*i+2 ; j++) {
                        if (liczba > table2[i] && tab)

                    }
                }
            }
        }*/

     /*   while (!choice.equals("Stop")) {
            Integer liczba = Integer.parseInt(choice);
            int j = 2;
            for (int i = 0; i < j; i++) {
                for (j = 2; j <= 2 * i + 2; j++) {
                    Integer[] table3 = new Integer[table2.length + j];
                    if (table2[i] == null) {
                        table2[i] = liczba;
                    }
                    if (liczba <= table2[i] && table2.length <= 2 * i + 1) {
                        j = 2 * i + 1;
                        for (int k = 0; k < table2.length; k++)
                            table3[k] = table2[k];
                    }
                    if (liczba <= table2[i] && table2[2 * i + 1] == null) {
                        table2[2 * j + 1] = liczba;
                        for (int k = 0; k < table2.length; k++)
                            table3[k] = table2[k];
                    }
                    if (liczba > table2[i] && table2.length <= 2 * i + 2) {
                        j = 2 * i + 2;
                        for (int k = 0; k < table2.length; k++)
                            table3[k] = table2[k];
                    } else if (liczba > table2[i] && table2[2 * i + 2] == null) {
                        table2[2 * i + 2] = liczba;
                    }
                    table2 = table3;
                }

            }
        }*/

       /* Integer[] table2 = {null};
        Scanner question = new Scanner(System.in);
        System.out.println("Provide number to add or Stop");
        String choice = question.nextLine();*/

        // Zad 2 Drzewo biarne na tablicy
        // Użytkownik sam wpisuje dane.
        // L = 2index+1;
        // P = 2index+2;

        Integer[] tab = new Integer[]{null};
        Scanner question = new Scanner(System.in);
        System.out.println("Provide number to add or Stop");
        String answer = question.nextLine();

        while (!answer.equals("Stop")) {
            answer = question.nextLine();
            if(answer.equals("Stop"))
                break;
            Integer liczba = Integer.parseInt(answer);
            int i = 0;
            while (true) {
                if (tab[i] == null) {
                    tab[i] = liczba;
                    break;
                } else if (liczba <= tab[i]) {
                    if (tab.length < 2 * i + 2) {
                        Integer[] temp = new Integer[2 * i + 2];
                        for (int j = 0; j < tab.length; j++) {
                            temp[j] = tab[j];
                        }

                        tab = temp;
                        tab[2 * i + 1] = liczba;
                        break;
                    }
                    i = 2 * i + 1;
                } else {
                    if (tab.length < 2 * i + 3) {
                        Integer[] temp = new Integer[2 * i + 3];
                        for (int j = 0; j < tab.length; j++) {
                            temp[j] = tab[j];
                        }

                        tab = temp;

                        tab[2 * i + 2] = liczba;
                        break;
                    }
                    i = 2 * i + 2;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}

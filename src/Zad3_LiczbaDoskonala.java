/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 08.12.2019
 */
final class Zad3_LiczbaDoskonala {
    public static void main(String[] args) {

        // Zadanie 2
        // dla chętnych znaleźć liczbe 5, 6, 7
        // trzeba zmienić algorytm, żeby nie szukał wszystkich liczb

        int iloscDoskonalych = 0;
        int liczba = 1;

        while (iloscDoskonalych < 4) {

            int suma = 0;

            for (int i = 1; i < liczba; i++) {
                if (liczba % i == 0)
                    suma += i;
            }

            if (suma == liczba) {
                iloscDoskonalych += 1;
                System.out.println(suma);
            }

            liczba++;
        }
    }
}

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 08.12.2019
 */
final class Zad2_Silnia {
    public static void main(String[] args) {

        // Zadanie 3
        // dla dowolnej liczby n wyświetl dla niej silnię

        int liczbaN = 4;
        int silnia = 1;

        for (int mnoznik = 1; mnoznik <=liczbaN ; mnoznik++){
            silnia *= mnoznik;
        }
        System.out.println(silnia);
    }
}

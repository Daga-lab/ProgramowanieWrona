/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 08.12.2019
 */
final class Zad1_DzielnikZLiczby {
    public static void main(String[] args) {

        //Zadanie 1
        // Znależć wszystkie dzielniki podanej liczby

        int liczbaDzielona = 9;

        for (int i = 1; i <= liczbaDzielona; i++) {
            if (liczbaDzielona % i == 0)
                System.out.println(i);
        }
    }
}

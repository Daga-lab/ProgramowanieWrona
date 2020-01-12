/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 09.12.2019
 */
final class Zad6_PracaDomowa {
    public static void main(String[] args) {

        // NWD - największy współny dzielnik
        // sposób z odejmowaniem

        int a = 78;
        int b = 282;


        int resztaZDzielenia = 0;

        while (a != b) {
            if (a < b) {
                b = b - a;
            } else
                a = a - b;
        }
        System.out.println("NWD to: " + b);

        // sposób z dzieleniem

        a = 26;
        b = 768;
        int NWD = 0;


        while (b != 0) {
            resztaZDzielenia = b % a;
            b = a;
            a = resztaZDzielenia;
            if (a == 0) {
                System.out.println("NWD to: " + b);
                NWD = b;
                break;
            }
        }

        // NWW - korzystając z NWD
        // ((x*y)/nwd(x,y)))

        a = 26;
        b = 768;

        int NWW = (a*b)/ NWD;
        System.out.println(NWW);



    }
}









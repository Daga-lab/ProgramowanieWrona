/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 14.12.2019
 */
final class Zad7_ZabawaNaStringach {
    public static void main(String[] args) {
        String aa = "AAABBBKCCBBBA";

        int l = 1;

        for (int i = 1; i < aa.length(); i++) {
            char x = aa.charAt(i - 1);
            char y = aa.charAt(i);
            if (x == y) {
                l++;
            }
            else if (x != y && l == 1) {
                System.out.print(x);
            }
            else if (x!= y && i == aa.length()-1){
                System.out.print(aa.charAt(i));
            }
            else {
                System.out.print(x + "" + l);
                l = 1;
            }
        }
    }
}

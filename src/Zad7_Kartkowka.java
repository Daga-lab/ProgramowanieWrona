import java.util.Arrays;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 14.12.2019
 */
final class Zad7_Kartkowka {
    public static void main(String[] args) {

        String dna = "gcctccgattaaatgtcaaccttatgttctatgtttatgactttgcgggctgcatactga" +
                "atttgccatggaacccccgcgaaagcgcagaatgccttaactgttatgcgatattcacac" +
                "cgtggacagtgagacggacgggcatgcttaatcgatggcatacactcacgcgtagaaagg" +
                "tatcaccatcgcggtggacccgtaagccgtaagtcaacgaacccccgatttcgatagcga" +
                "cggtcaggattgttgatgcggagcgcaagttaacagtctaagcctgcatgtggtgaatag";

        // Zad 1. Zamieni wszystkie znaki na duże
        String DNA = dna.toUpperCase();
        System.out.println(DNA);

        //Zad 2. Podzieli wizualnie nić DNA na tryplety

        char[] ch = DNA.toCharArray();
        int r = 1;
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
            if (r %3 == 0)
                System.out.print(" ");
            r++;
        }
        System.out.println(" ");

        // Zad 3. Dopisze do niej sieć komplementarną
        // Nić komplementarna:
        //	A <-> T
        //	C <-> G

        for (int i =0; i< DNA.length(); i++){
            char znak = DNA.charAt(i);
            if (znak == 'A'){
                System.out.print("T");
            }else if (znak == 'T'){
                System.out.print("A");
            }else if (znak == 'C'){
                System.out.print("G");
            }else if (znak == 'G') {
                System.out.print("C");
            }
        }

        System.out.println(" ");

        char[] ch2 = DNA.toCharArray();
        int r2 = 1;
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch2[i]);
            if (r2 %3 == 0)
                System.out.print(" ");
            r2++;
        }
        System.out.println(" ");
    }
}

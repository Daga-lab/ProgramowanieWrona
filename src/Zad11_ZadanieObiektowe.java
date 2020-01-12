/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 12.01.2020
 */
class Zwierze {

    private String gatunek;
    private int wiek;
    private double waga;
    private boolean isMale;

    Zwierze(String gatunek, int wiek, double waga, boolean isMale) {
        setGatunek(gatunek);
        setWiek(wiek);
        setWaga(waga);
        setMale(isMale);
    }

    private void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    private void setWiek(int wiek) {
        if (wiek > 0) {
            this.wiek = wiek;
        }
    }

    private void setWaga(double waga) {
        if (waga > 0) {
            this.waga = waga;
        }
    }

    private void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public double getDziennaPorcjaKarmienia(){
        return this.waga/10;
    }

    @Override
    public String toString() {
        return "ZWIERZE:" +
                "gatunek: " + gatunek +
                ", wiek: " + wiek +
                ", waga: " + waga +
                ", isMale: " + isMale;
    }
}

final class Zad11_ZadanieObiektowe {
    public static void main(String[] args) {

        Zwierze lew = new Zwierze("Lew", 8, 19.5, true);
        System.out.println(lew);
        System.out.println(lew.getDziennaPorcjaKarmienia());

    }
}



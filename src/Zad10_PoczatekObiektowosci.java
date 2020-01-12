/**
 * Poczatki obiektowosci z Piotrem
 *
 * @author dagmarakitkowska@gmail.com
 * @since 12.01.2020
 */
class Samochod {
    private String kolor;
    private int moc;
    private static int iloscKol;

    static {
        iloscKol = 4;
    }

    Samochod(String kolor, int moc) {
        setKolor(kolor);
        setMoc(moc);
    }

    public Samochod(int moc){
        this("Brak", moc);
    }

    public Samochod(String kolor){
        this(kolor, 0);
    }

    private void setMoc(int moc) {
        if (moc > 0) {
            this.moc = moc;
        }
    }


    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getCzasPrzebycia1000(){
        return 1000/(double)this.moc;
    }

    public String toString() {
        return "[kolor: " + this.kolor + " ilosc kol: " + iloscKol + " moc: " + moc + "]";
    }
}

final class Zad10_PoczatekObiektowosci {
    public static void main(String[] args) {


        Samochod Opel = new Samochod("Czerwony", 250);
        Samochod Ford = new Samochod("Niebieski", -180);

        System.out.println(Opel.getCzasPrzebycia1000());

        System.out.println(Opel);
        System.out.println(Ford);

    }
}

class SamochorOsobowy extends Samochod{

    SamochorOsobowy(String kolor, int moc) {
        super(kolor, moc);

    }
}

class SamochodCiezarowy extends Samochod{

    SamochodCiezarowy(String kolor, int moc) {
        super(kolor, moc);
    }
}

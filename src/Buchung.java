import java.time.LocalDate;


public class Buchung {
    private Buchung vorherigeBuchung;
    private LocalDate buchungsdatum;
    private String buchungsText;
    private double betrag;
    private String buchungsnummer;
    private static int autorun=0;

    Buchung (){
        vorherigeBuchung=null;
        buchungsdatum=null;
        buchungsText=null;
        betrag=0;
        buchungsnummer="BNr. 00";
        autorun++;

    }

    Buchung(double bertag,String text,Buchung vorherigeBuchung){
        this.betrag=bertag;
        this.buchungsText=text;
        this.buchungsdatum= LocalDate.now();
        this.vorherigeBuchung=vorherigeBuchung;
        this.buchungsnummer="BNr. 00"+autorun;
        autorun++;
    }

    public Buchung getVorherigeBuchung() {
        return vorherigeBuchung;
    }

    public void setVorherigeBuchung(Buchung vorherigeBuchung) {
        this.vorherigeBuchung = vorherigeBuchung;
    }

    public LocalDate getBuchungsdatum() {
        return buchungsdatum;
    }


    public String getBuchungsText() {
        return buchungsText;
    }

    public void setBuchungsText(String buchungsText) {
        this.buchungsText = buchungsText;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    @Override
    public String toString() {
        if (this==null) return "null";
        if(this.vorherigeBuchung==null){
            return"Buchung{" +
                    "BuchungsNummer=" + buchungsnummer +
                    ", buchungsdatum=" + buchungsdatum.toString() +
                    ", buchungsText='" + buchungsText + '\'' +
                    ", betrag=" + betrag +
                    "}";
        }
        return "Buchung{" +
                "BuchungsNummer=" + buchungsnummer +
                ", buchungsdatum=" + buchungsdatum.toString() +
                ", buchungsText='" + buchungsText + '\'' +
                ", betrag=" + betrag +
                ", vorherigeBuchung=" + vorherigeBuchung.toString() +
                '}';
    }
}

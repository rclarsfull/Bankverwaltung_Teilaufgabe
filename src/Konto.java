public class Konto {
    private Buchung letzsteBuchung;
    private double kontostand;

    Konto(){
        letzsteBuchung=null;
        kontostand=0;
    }

    public void createBuchung(double betrag, String text){
        Buchung temp=new Buchung(betrag,text,letzsteBuchung);
        kontostand+=temp.getBetrag();
        letzsteBuchung=temp;
    }

    public Buchung getLetzsteBuchung() {
        return letzsteBuchung;
    }

    public double getKontostand() {
        return kontostand;
    }

    @Override
    public String toString() {
        String ausgabe="Konto{kontostand=" + kontostand;
        Buchung temp=letzsteBuchung;
        ausgabe+=", Buchung: "+temp.toString()+"\n";
       // while (temp!=null){
       //     ausgabe+=", Buchung: "+temp.toString()+"\n";
         //   temp=temp.getVorherigeBuchung();
       // }
        ausgabe+="}";
        return ausgabe;
    }

    public int getBuchangasanzahl(){
        Buchung temp=letzsteBuchung;
        int zaehler=0;
        while(temp!=null){
            temp=temp.getVorherigeBuchung();
            zaehler++;
        }
        return zaehler;

    }

    public Buchung findBuchung(String buchungsnummer){
        Buchung temp=letzsteBuchung;
        Buchung ausgabe=null;
        while(temp!=null && !temp.getBuchungsnummer().equalsIgnoreCase(buchungsnummer)){
            temp=temp.getVorherigeBuchung();
        }
        if (temp.getBuchungsnummer().equalsIgnoreCase(buchungsnummer)) return temp;
        return null;
    }
}

public class Test {
    public static void main(String[]args){
        //Buchung startB=new Buchung();
        //Buchung testB=new Buchung(3,"test",startB);


       // System.out.println(testB.toString());

        Konto testKonto=new Konto();

        testKonto.createBuchung(1000,"Geld1");
        testKonto.createBuchung(134,"minusGeld");
        System.out.println(testKonto.toString());
        System.out.println(testKonto.findBuchung("BNr. 001"));
        System.out.println(testKonto.getBuchangasanzahl());
    }
}

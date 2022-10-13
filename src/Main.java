public class Main {
    public static void main(String[] args) {
        Tulajdonos peldanyTul = new Tulajdonos("Makker Zsombor");
        Szamla szamla = new MegtakaritasiSzamla(peldanyTul);
        System.out.println(peldanyTul.getNev());
        szamla.befizet(20000);
        System.out.println("Számla értékek: "+ szamla.aktualisEgyenleg);
        szamla.kivesz(10000);
        System.out.println("Számla értéke kivétel után: "+ szamla.aktualisEgyenleg);

    }
}
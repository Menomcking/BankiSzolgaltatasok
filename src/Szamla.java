public abstract class Szamla {
    protected int aktualisEgyenleg;

    public Szamla(int aktualisEgyenleg) {
        this.aktualisEgyenleg = aktualisEgyenleg;
    }
        public int getAktualisEgyenleg() {
            return aktualisEgyenleg;
    }
    public void befized(int osszeg){
        this.aktualisEgyenleg += osszeg;
    }
    public abstract boolean kivesz(int osszeg);
}

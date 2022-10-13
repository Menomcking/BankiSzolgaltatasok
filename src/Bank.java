import java.util.List;
public class Bank {
    private List<Szamla> szamlaLista;

    public Bank(){

    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        if(hitelKeret > 0){
            HitelSzamla hitelSzamla = new HitelSzamla(tulajdonos, hitelKeret);
            return hitelSzamla;
        }else if(hitelKeret == 0){
            MegtakaritasiSzamla megtakaritasiSzamla = new MegtakaritasiSzamla(tulajdonos);
            return megtakaritasiSzamla;
        }else throw new IllegalArgumentException("A hitelkeret nem lehet kisebb mint 0.");
    }
    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int total = 0;
                for(int i = 0; i < szamlaLista.size(); i++){
                    if(szamlaLista.get(i).getTulajdonos() == tulajdonos){
                        total += szamlaLista.get(i).aktualisEgyenleg;
                    }
                }
                return total;
    }
    public int legnagyobbEgyenlegSzamla(Tulajdonos tulajdonos){
        int maximum = 0;
        for(int i = 0;)
    }
}

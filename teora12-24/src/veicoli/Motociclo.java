package veicoli;

public class Motociclo extends Veicolo{
    private int cilindrata;

    //Costruttori
    public Motociclo(String targa, String marca, String modello, boolean isGuasto, int cilindrata) {
        super(targa, marca, modello, isGuasto);
        this.cilindrata = cilindrata;
    }
    public Motociclo() {
        super();
        this.cilindrata = 0;
    }

    //get e set
    public int getCilindrata() { return cilindrata; }
    public void setCilindrata(int cilindrata) { this.cilindrata = cilindrata; }

    //ToString e equals
    @Override
    public String toString() {
        return super.toString()+"\tcilindrata="+ this.cilindrata + '\'';
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Motociclo){
            Motociclo r=(Motociclo) obj;
            return super.equals(obj) && this.cilindrata==r.getCilindrata();
        }
        return false;
    }
}

package veicoli;

public class Vettura extends Veicolo{
    private String tipologiaOClasseDelVeicolo;

    //Costruttori
    public Vettura(String targa, String marca, String modello, boolean isGuasto, String tipologiaOClasseDelVeicolo) {
        super(targa, marca, modello, isGuasto);
        this.tipologiaOClasseDelVeicolo = tipologiaOClasseDelVeicolo;
    }

    public Vettura() {
        super();
        this.tipologiaOClasseDelVeicolo = "NON INSERITA";
    }
    //Get e set
    public String getTipologiaOClasseDelVeicolo() { return tipologiaOClasseDelVeicolo; }
    public void setTipologiaOClasseDelVeicolo(String tipologiaOClasseDelVeicolo) { this.tipologiaOClasseDelVeicolo = tipologiaOClasseDelVeicolo; }

    //ToString e equals
    @Override
    public String toString() {
        return super.toString()+"\ttipologiaOClasseDelVeicolo="+ this.tipologiaOClasseDelVeicolo + '\'';
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Vettura){
            Vettura r=(Vettura) obj;
            return super.equals(obj) && this.tipologiaOClasseDelVeicolo.equalsIgnoreCase(r.getTipologiaOClasseDelVeicolo());
        }
        return false;
    }
}

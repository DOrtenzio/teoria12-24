package veicoli;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private boolean isGuasto;

    //Costruttori
    public Veicolo(String targa, String marca, String modello, boolean isGuasto) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.isGuasto = isGuasto;
    }
    public Veicolo() {
        this("NON INSERITA","NON INSERITA","NON INSERITO",false);
    }

    //get e set
    public String getTarga() { return targa; }
    public void setTarga(String targa) { this.targa = targa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModello() { return modello; }
    public void setModello(String modello) { this.modello = modello; }

    public boolean isGuasto() { return isGuasto; }
    public void setGuasto(boolean guasto) { isGuasto = guasto; }

    //To string e equals
    @Override
    public String toString() {
        return "targa='" + targa + '\'' + ", marca='" + marca + '\'' +  ", modello='" + modello + '\'' +  ", isGuasto=" + isGuasto;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Veicolo){
            Veicolo r=(Veicolo) obj;
            return this.isGuasto == r.isGuasto && this.targa.equalsIgnoreCase(r.getTarga()) && this.modello.equalsIgnoreCase(r.getModello()) && this.marca.equalsIgnoreCase(r.getMarca());
        }
        return false;
    }
}

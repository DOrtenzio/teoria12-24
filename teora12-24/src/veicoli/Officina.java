package veicoli;

public class Officina {
    public double ripara(Veicolo veicolo){
        if (veicolo.isGuasto()){
            veicolo.setGuasto(false);
           if(veicolo instanceof Vettura)
               return 150.0;
           else
               return 100.0;
        }else{
            if(veicolo instanceof Vettura)
                return 20.0;
            else
                return 10.0;
        }
    }
}

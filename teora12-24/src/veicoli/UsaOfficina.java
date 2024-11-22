package veicoli;

import java.util.Scanner;

public class UsaOfficina {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);

        Officina daMario=new Officina();
        final int numeroVeicoliMassimoInOfficina = 5;
        Veicolo [] veicoli=new Veicolo[numeroVeicoliMassimoInOfficina];
        int inseriti=0,scelta;

        //Inserimento delle vetture/motocicli
        do {
            System.out.println("Scegli un'opzione:" +
                    "\n0- Aggiungi nuovo veicolo" +
                    "\n1- Vedi prezzi guasti" +
                    "\n2- Esci");
            scelta=Integer.parseInt(in.next());
            switch (scelta){
                case 0:
                    System.out.println("Inserire la targa");
                    String targa=in.next();
                    System.out.println("Inserire la marca");
                    String marca=in.next();
                    System.out.println("Inserire il modello");
                    String modello=in.next();
                    System.out.println("E' guasto?");
                    boolean isGuasto=Boolean.parseBoolean(in.next());

                    System.out.println("Scegli se è un motociclo (0) o una vettura(1)");
                    switch (Integer.parseInt(in.next())){
                        case 0:
                            System.out.println("Inserire la cilindrata");
                            int cilindrata=Integer.parseInt(in.next());
                            veicoli[inseriti]=new Motociclo(targa,marca,modello,isGuasto,cilindrata);
                            inseriti++;
                            break;
                        case 1:
                            System.out.println("Inserire la tipologia");
                            String tipologia=in.next();
                            veicoli[inseriti]=new Vettura(targa,marca,modello,isGuasto,tipologia);
                            inseriti++;
                            break;
                        default:
                            System.out.println("Scegli solo moto o veicolo la prossima volta");
                    }
                    break;
                case 1:
                    if (inseriti==0)
                        System.out.println("INSERIRE DEI VEICOLI PRIMA");
                    else {
                        System.out.println("Veicoli in riparazione");
                        for (int i = 0; i < inseriti; i++) {
                            System.out.println("VEICOLO ARRIVATO IN OFFICINA: "+veicoli[i]+" COSTO RIPARAZIONE: "+daMario.ripara(veicoli[i]));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Scegli una fra le opzioni proposte");
            }
        }while(scelta!=2);
    }
}

package avvii;

import entities.*;

import java.util.ArrayList;

public class MainPers
{
    static void main() {
//        Persona p = new Persona("Stefano","Rubinetti");
        Studente s = new Studente("Pippo","Franco",84,4,true);
        Professore p = new Professore("Pippo","Franco",6000,15,"Canto","Francologia");
        PND b = new PND("Pippo","Franco",5999,15,"Bidello");

        ArrayList<Persona> tuttiQuelliNellaScuola = new ArrayList<>();
        tuttiQuelliNellaScuola.add(s);
        tuttiQuelliNellaScuola.add(p);
        tuttiQuelliNellaScuola.add(b);

        ArrayList<Lavoratore> tuttiLavoratori = new ArrayList<>();
        tuttiLavoratori.add(p);
        tuttiLavoratori.add(b);
    }
}

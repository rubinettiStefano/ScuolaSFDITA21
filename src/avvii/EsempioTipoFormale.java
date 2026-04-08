package avvii;

import entities.Airplane;
import entities.Lavoratore;
import entities.Professore;
import interfacce.Csvable;
import libreria.Console;

public class EsempioTipoFormale
{
    static void main() {
        //quale è il tipo CONCRETO DELL'OGGETTO CREATO?     Professore
        //come lo sto vedendo tramite variabile p, quale è il suo tipo formale? Professore

        Professore p = new Professore(
                "Stefano",
                "Rubinetti",
                19000,
                26,
                "Java",
                "Demonio"
        );

        Airplane a = new Airplane("AA99AA","BoingBoing777");
        //vederlo come professore significa avere accesso a:
        //ciò che è stato dichiarato nella classe professore
        //ciò che è stato ereditato da lavoratore (che a sua volta ha ereditato da Persona)
        //ciò che è stato dichiarato nelle interfacce che implementa (Csvable)
        stampaQualcosa(p);
        stampaQualcosa(a);
    }

    static void stampaQualcosa(Csvable c )
    {
        Console.print(c.toCsv());
    }
}

package interfacce;

//Andiamo a definire COSA un lettore da tastiera deve fare,
//NON COME LO FARÀ

//COSA-> firma del metodo + javadoc
public interface LettoreDaTastiera {
    /**
     * Chiediamo all'utente un intero stampando la domanda passata come parametro
     * Se utente mette qualsiasi cosa non sia un intero, allora richiediamo
     *
     * @param domanda
     * @return
     */
    int askInt(String domanda);
    //VIENE DETTO METODO ASTRATTO, metodo senza CORPO-CODICE, che definisce il
    //cosa ma non il come
    //in automatico tutti i metodi nelle interfacce sono astratti e public

    /**
     * Chiediamo all'utente una stringa stampando la domanda passata come parametro
     *
     * @param domanda
     * @return
     */
    String askString(String domanda);

    /**
     * Chiediamo all'utente un double stampando la domanda passata come parametro
     * Se utente mette qualsiasi cosa non sia un double, allora richiediamo
     *
     * @param domanda
     * @return
     */
    double askDouble(String domanda);

    /**
     *  Chiediamo all'utente un booleano stampando la domanda passata come parametro
     *  e quale valore mettere per avere true.
     *  Se utente mette quel valore restituiamo true, altrimenti false
     * @param domanda
     * @param rispostaTrue
     * @return
     */
    boolean askBoolean(String domanda,String rispostaTrue);

    /**
     * Chiediamo all'utente un intero stampando la domanda passata come parametro
     * e il valore min e massimo possibile
     * Se utente mette intero contenuto in quei due valori, lo restituiamo, in  qualsiasi
     * altro caso richiediamo
     * @param domanda
     * @param min
     * @param max
     * @return
     */
    int askIntBetween(String domanda,int min,int max);

    /**
     * Chiediamo all'utente un double stampando la domanda passata come parametro
     * e il valore min e massimo possibile
     * Se utente mette double contenuto in quei due valori, lo restituiamo, in  qualsiasi
     * altro caso richiediamo
     * @param domanda
     * @param min
     * @param max
     * @return
     */
    double askDoubleBetween(String domanda,double min,double max);

    /**
     * Chiediamo all'utente una Stringa stampando la domanda passata come parametro
     * e il valore min e massimo di lunghezza che può avere
     * Se utente risponde con stringa corretta la restituiamo, altrimenti richiediamo
     * @param domanda
     * @param min
     * @param max
     * @return
     */
    String askStringLengthBetween(String domanda,int min,int max);

    /**
     * Chiediamo utente di mettere una password che deve avere minimo
     * -8 caratteri
     * -una maiuscola
     * -una minuscola
     * -un numero
     * -un carattere speciale
     *
     * Se la mette la restituiamo, altrimenti richiediamo
     * @return
     */
    String askPassword();

    /**
     * Chiediamo all'utente di inserire 1 dei valori nell'array passato come parametro
     * Se lo fa lo restituiamo, altrimenti richiediamo
     * @param domanda
     * @param valoriPossibili
     * @return
     */
    String selectOption(String domanda,String[] valoriPossibili);
}

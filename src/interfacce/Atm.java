package interfacce;

import entitiesesercizio.AtmV1;
import entitiesesercizio.AtmV2;

/**
 * Interfaccia che indica le operazioni che deve poter svolgere un ATM
 * Naturalmente le classi che la implementano dovranno avere al loro interno
 * una proprietà per il valore del saldo, fatela partire da 1000
 */
public interface Atm
{
    static Atm make()
    {
        return new AtmV1();
        //quando avete finito il V2, commentate la riga sopra e scommentate quella sotto
        //return new AtmV2();
    }

    /**
     * Prima versione: semplicemente aggiunge la cifra al saldo
     * Seconda versione:
     * controlla se la cifra è -0,nel caso lancia runtime exception
     *
     * @param cifra
     */
    void deposito(double cifra);

    /**
     * Prima versione: semplicemente toglie la cifra al saldo
     * Seconda versione:
     *      * controlla se la cifra è -0,nel caso lancia runtime exception
     *      * controlla se ci sono abbastanza soldi, se non ci sono lancia runtime exception
     * @param cifra
     */
    void prelievo(double cifra);

    /**
     * Restituisce il saldo
     * @return
     */
    double saldoRimanente();
}

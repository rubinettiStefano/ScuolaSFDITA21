package avvii;

import interfacce.Cypher;

public class MainCriptazione
{

    //STATIC -> di classe, non di oggetto

    static void main()
    {
        String parola = "ciao";
        Cypher criptatore = Cypher.make();


        String parolaCriptata = criptatore.cripta(parola);
        System.out.println(parolaCriptata);
        String parolaDecriptata = criptatore.decripta(parolaCriptata);
        System.out.println(parolaDecriptata);
    }
}

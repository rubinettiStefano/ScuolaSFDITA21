package avvii;

import implementazioni.CifrarioDiCesare;
import implementazioni.CriptatoreAES;
import interfacce.Cypher;

public class MainCriptazione
{
    static void main() {
        String parola = "ciao";
        Cypher criptatore = new CriptatoreAES();










        String parolaCriptata = criptatore.cripta(parola);
        System.out.println(parolaCriptata);
        String parolaDecriptata = criptatore.decripta(parolaCriptata);
        System.out.println(parolaDecriptata);
    }
}

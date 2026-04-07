package interfacce;

import implementazioni.CifrarioDiCesare;
import implementazioni.CriptatoreAES;

public interface Cypher
{
    static Cypher make()
    {
        double randomico = Math.random();

        if(randomico<0.5)
            return new CifrarioDiCesare();
        else
            return new CriptatoreAES();
    }

    String cripta(String chiaro);

    String decripta(String criptata);
}

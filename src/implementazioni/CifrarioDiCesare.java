package implementazioni;

import interfacce.Cypher;

public class CifrarioDiCesare implements Cypher
{
    private int chiave = (int)(Math.random()*20)+1;

    @Override
    public String cripta(String chiaro) {
        String res = "";
        //[0] -> 'c'
        //[1] -> 'i'
        //[2] -> 'a'
        //[3] -> 'o'
        for(char c: chiaro.toCharArray())
        {
            char ris= (char)((c+chiave)%123);
            if(c+chiave>123)
                ris+=97;

            res+=ris;
        }

        return res;
    }

    @Override
    public String decripta(String criptata) {
        String res = "";
        //[0] -> 'c'
        //[1] -> 'i'
        //[2] -> 'a'
        //[3] -> 'o'
        for(char c: criptata.toCharArray())
        {
            int ris = c-chiave;
            if(ris<97)
                res+= 123 -(97-ris);
            else
                res+=(char)ris;
        }
        return res;
    }
}

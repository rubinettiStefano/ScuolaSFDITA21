package implementazioni;

import interfacce.Translator;

import java.util.ArrayList;
import java.util.List;

public class TraduttoreItaEng implements Translator
{
    @Override
    public String translate(String daTradurre) {
        String res;
        switch (daTradurre.toLowerCase())
        {
            case "ciao"->res="hello";
            case "arrivederci"->res="bye";
            case "penna"->res="pen";
            case "tavolo"->res="table";
            default -> res="TRADUZIONE FALLITA";
        }
        return res;
    }


}

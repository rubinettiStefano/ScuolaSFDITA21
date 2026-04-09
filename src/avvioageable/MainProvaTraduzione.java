package avvioageable;

import implementazioni.TraduttoreItaEng;
import interfacce.Translator;

import java.util.List;

public class MainProvaTraduzione
{
    static void main() {
        Translator itaToEng = new TraduttoreItaEng();
//        String parolaItaliana = "ciao";
//        String parolaTradotta = itaToEng.translate(parolaItaliana);
//
//        System.out.println(parolaTradotta);
        List<String> paroleItaliane = List.of("ciao","tavolo","penna");
        List<String> traduzioneInglese = itaToEng.translateAll(paroleItaliane);
        System.out.println(traduzioneInglese);
    }
}

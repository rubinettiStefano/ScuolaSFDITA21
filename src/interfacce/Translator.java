package interfacce;

import java.util.ArrayList;
import java.util.List;

public interface Translator
{
    /**
     * Entra una String in una determinata lingua e esce in un altra
     * @param daTradurre
     * @return
     */
    String translate(String daTradurre);

    default List<String> translateAll(List<String> listaDaTradurre)
    {
        List<String> res = new ArrayList<>();

        for(String s: listaDaTradurre)
            res.add(translate(s));

        return res;
    }
}

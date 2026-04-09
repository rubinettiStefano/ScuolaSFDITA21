package avvioageable;

import entitiesageable.PersonV2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPersonaMigliorata
{
    static void main() {
        PersonV2 p1 = new PersonV2("Stefano","Rubinetti", LocalDate.of(1995,8,27));
        PersonV2 p2 = new PersonV2("Rosario","Schiano Di Cola", "2004-09-24");
        PersonV2 p3 = new PersonV2("Giacomo","Rabbia", 2000,12,12);

        List<PersonV2> persone = new ArrayList<>();
        persone.add(p1);
        persone.add(p2);
        persone.add(p3);

        System.out.println(persone);

        Collections.sort(persone);
        System.out.println(persone);
    }
}

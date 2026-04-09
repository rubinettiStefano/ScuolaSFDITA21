package avvioageable;

import entitiesageable.House;
import entitiesageable.PersonV2;
import entitiesageable.Smartphone;
import interfacce.Ageable;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    static void main()
    {
        List<PersonV2> persone = new ArrayList<>();
//        persone.add(new Person("Mario", "Rossi", 30));
//        persone.add(new Person("Laura", "Bianchi", 25));
//        persone.add(new Person("Giuseppe", "Verdi", 50));

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(new Smartphone("iPhone 15", "Apple", 999.0, 2025));
        smartphones.add(new Smartphone("Galaxy S24", "Samsung", 850.0, 2024));
        smartphones.add(new Smartphone("Pixel 8", "Google", 700.0, 2023));

        List<House> houses = new ArrayList<>();
        houses.add(new House("Via Roma 1", 250000, 1990));
        houses.add(new House("Corso Italia 10", 400000, 2015));
        houses.add(new House("Piazza Duomo 5", 800000, 1900));


        List<Ageable> daCalcolare = new ArrayList<>();
        for(Smartphone s: smartphones)
            daCalcolare.add(s);

        System.out.println(calcolaMedia(daCalcolare ));
    }

    private static double calcolaMedia(List<Ageable> l)
    {
        double somma = 0;
        for(Ageable a : l)
            somma+=a.getAge();

        double media = somma/l.size();

        return media;
    }

//    private static double calcolaMediaSmart(List<Smartphone> l)
//    {
//        double somma = 0;
//        for(Smartphone s : l)
//            somma+=2026-s.getReleaseYear();
//
//        double media = somma/l.size();
//
//        return media;
//    }
//
//    private static double calcolaMediaPers(List<Person> l)
//    {
//        double somma = 0;
//        for(Person s : l)
//            somma+=s.getAge();
//
//        double media = somma/l.size();
//
//        return media;
//    }
//
//    private static double calcolaMediaHouse(List<House> l)
//    {
//        double somma = 0;
//        for(House s : l)
//            somma+= somma+=2026-s.getConstructionYear();
//
//        double media = somma/l.size();
//
//        return media;
//    }
}

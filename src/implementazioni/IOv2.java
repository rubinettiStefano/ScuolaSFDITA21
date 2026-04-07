package implementazioni;

import interfacce.LettoreDaTastiera;

import java.util.Scanner;

public class IOv2 implements LettoreDaTastiera {
    //Creo scanner per leggere da tastiera
    private Scanner sc = new Scanner(System.in);

    @Override
    public int askInt(String domanda) {
        System.out.println(domanda);
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (RuntimeException e) {
                System.out.println("Non è un numero, rimetti");
            }
        }

    }

    @Override
    public String askString(String domanda) {
        System.out.println(domanda);
        return sc.nextLine();
    }

    @Override
    public double askDouble(String domanda) {
        System.out.println(domanda);
        return Double.parseDouble(sc.nextLine());
    }

    @Override
    public boolean askBoolean(String domanda, String rispostaTrue) {
        System.out.println(domanda + " (inserisci " + rispostaTrue + " per vero, altrimenti sarà falso)");
        return sc.nextLine().equalsIgnoreCase(rispostaTrue);
    }

    @Override
    public int askIntBetween(String domanda, int min, int max) {
        System.out.println(domanda + "(min:" + min + ",max:" + max + ")");
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public double askDoubleBetween(String domanda, double min, double max) {
        System.out.println(domanda + "(min:" + min + ",max:" + max + ")");
        return Double.parseDouble(sc.nextLine());
    }

    @Override
    public String askStringLengthBetween(String domanda, int min, int max) {
        System.out.println(domanda + "(lunghezza min:" + min + ",lunghezza max:" + max + ")");
        return sc.nextLine();
    }

    @Override
    public String askPassword() {
        System.out.println("Metti Password");
        return sc.nextLine();
    }

    @Override
    public String selectOption(String domanda, String[] valoriPossibili) {
        System.out.println(domanda + " - valori possibili:");
        for (String s : valoriPossibili)
            System.out.println("- " + s);
        return sc.nextLine();
    }
}

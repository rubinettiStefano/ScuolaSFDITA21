package implementazioni;

import interfacce.LettoreDaTastiera;

public class IOv1 implements LettoreDaTastiera
{
    @Override
    public int askInt(String domanda) {
        return 0;
    }

    @Override
    public String askString(String domanda) {
        return "";
    }

    @Override
    public double askDouble(String domanda) {
        return 0;
    }

    @Override
    public boolean askBoolean(String domanda, String rispostaTrue) {
        return false;
    }

    @Override
    public int askIntBetween(String domanda, int min, int max) {
        return 0;
    }

    @Override
    public double askDoubleBetween(String domanda, double min, double max) {
        return 0;
    }

    @Override
    public String askStringLengthBetween(String domanda, int min, int max) {
        return "";
    }

    @Override
    public String askPassword() {
        return "";
    }

    @Override
    public String selectOption(String domanda, String[] valoriPossibili) {
        return "";
    }
}

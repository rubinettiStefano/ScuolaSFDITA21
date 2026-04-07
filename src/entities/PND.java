package entities;

public class PND extends Lavoratore
{
    private String ruolo;

    public PND(){}
    public PND(String nome, String cognome, double grossMonthlySalary, int nMonths, String ruolo) {
        super(nome, cognome, grossMonthlySalary, nMonths);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "PND{" +
                "ruolo='" + ruolo + '\'' +
                "} " + super.toString();
    }
}

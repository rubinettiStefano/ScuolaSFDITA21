package entities;

import interfacce.Csvable;

public class Professore extends Lavoratore implements Csvable
{
    private String materia;
    private String titoloStudio;

    public Professore(){}
    public Professore(String nome, String cognome, double grossMonthlySalary, int nMonths, String materia, String titoloStudio) {
        super(nome, cognome, grossMonthlySalary, nMonths);
        this.materia = materia;
        this.titoloStudio = titoloStudio;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTitoloStudio() {
        return titoloStudio;
    }

    public void setTitoloStudio(String titoloStudio) {
        this.titoloStudio = titoloStudio;
    }

    @Override
    public String toString() {
        return "Professore{" +
                "materia='" + materia + '\'' +
                ", titoloStudio='" + titoloStudio + '\'' +
                "} " + super.toString();
    }

    @Override
    public String toCsv() {
        return "pro,"+getNome()+","+getCognome()+","+getGrossMonthlySalary()+","+getnMonths()+","+getMateria()+","+getTitoloStudio();
    }
}

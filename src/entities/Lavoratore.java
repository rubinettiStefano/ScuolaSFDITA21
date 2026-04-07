package entities;

public abstract class Lavoratore extends Persona {
    private double grossMonthlySalary;
    private int nMonths;

    public Lavoratore() {
    }

    public Lavoratore(String nome, String cognome, double grossMonthlySalary, int nMonths) {
        super(nome, cognome);
        this.grossMonthlySalary = grossMonthlySalary;
        this.nMonths = nMonths;
    }

    public double getAnnualGrossSalary() {
        return grossMonthlySalary * nMonths;
    }

    public double getAnnualNetSalary() {
        //fino a 28k 23%
        //da 28 a 50 33
        //sopra 50 43
        return getAnnualGrossSalary() - taxation();
    }

    public double getMonthlyNetSalary() {
        return   getAnnualNetSalary() /nMonths;
    }

    private double taxation() {
        double gross = getAnnualNetSalary();
        if (gross<28001)
            return gross*0.23;

        if(gross<50001)
            return 28000*0.23 + (gross-28000)*0.33;

        return 28000*0.23 + 22000*0.33 + (gross-50000)*0.43;
    }


    public double getGrossMonthlySalary() {
        return grossMonthlySalary;
    }

    public void setGrossMonthlySalary(double grossMonthlySalary) {
        this.grossMonthlySalary = grossMonthlySalary;
    }

    public int getnMonths() {
        return nMonths;
    }

    public void setnMonths(int nMonths) {
        this.nMonths = nMonths;
    }

    @Override
    public String toString() {
        return "Lavoratore{" +
                "grossMonthlySalary=" + grossMonthlySalary +
                ", nMonths=" + nMonths +
                "} " + super.toString();
    }
}

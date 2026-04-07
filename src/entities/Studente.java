package entities;

public  class Studente extends Persona
{
    private int age;
    private int year;
    private boolean primina;

    public Studente() {
    }

    public Studente(String nome, String cognome, int age, int year, boolean primina) {
        super(nome, cognome);
        this.age = age;
        this.year = year;
        this.primina = primina;
    }

    //è in pari con gli studi, non è mai stato bocciato
    public boolean isInTime()
    {
        //anno -> 1 a 5
        //age - anno - 13 == 0
        //age - anno - (primina ? 12 : 13) == 0
        return (age - year - (primina ? 12 : 13)) == 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isPrimina() {
        return primina;
    }

    public void setPrimina(boolean primina) {
        this.primina = primina;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "age=" + age +
                ", year=" + year +
                ", primina=" + primina +
                "} " + super.toString();
    }
}

package entitiesageable;

import interfacce.Ageable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Cambiare in persona age in birthday
//invece che salvare eta salvate compleanno
//cambiare getAge per far calcolare gli anni (sugg: usate until delle date)
//notate che il compareTo continua a funzionare
public class PersonV2 implements Ageable,Comparable<PersonV2>
{
    public PersonV2(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public PersonV2(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        setBirthday(birthday);
    }

    public PersonV2(String name, String surname, int birthYear, int birthMonth, int birthDay) {
        this.name = name;
        this.surname = surname;
       setBirthday(birthYear,birthMonth,birthDay);
    }

    private String name,surname;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
                            //"1995-08-27"
    /**
     * se vuoi impostare la data passandomi come parametro una String
     * formatta "yyyy-MM-dd
     * @param birthdayInString
     */
    public void setBirthday(String birthdayInString) {
        this.birthday = LocalDate.parse(birthdayInString);
    }

    public void setBirthday(int y,int m,int d) {
        this.birthday = LocalDate.of(y,m,d);
    }
    //restituisce numero negativo se this<o
    //restituisce 0 se uguali
    //positivo se this>o
    public int compareTo(PersonV2 o) {
      return (int)( getAge()-o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" +  getAge() +
                '}';
    }

    @Override
    public double getAge() {
        return birthday.until(LocalDate.now(), ChronoUnit.YEARS);
    }
}

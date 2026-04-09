package entitiesageable;

import interfacce.Ageable;

//Cambiare in persona age in birthday
//invece che salvare eta salvate compleanno
//cambiare getAge per far calcolare gli anni (sugg: usate until delle date)
//notate che il compareTo continua a funzionare
public class Person implements Ageable,Comparable<Person>
{
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String name,surname;
    private int age;

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

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //restituisce numero negativo se this<o
    //restituisce 0 se uguali
    //positivo se this>o
    public int compareTo(Person o) {
      return (int)(age-o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

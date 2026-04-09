package interfacce;

public interface Ageable
{
    /**
     * eta in anni
     * @return
     */
    double getAge();

    default double getAgeInMonth()
    {
        return getAge()*12;
    }
}

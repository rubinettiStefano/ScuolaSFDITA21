package avvii;

import interfacce.Atm;
import libreria.Console;

public class MainEsercizio
{
    static void main()
    {
        Atm atm = Atm.make();

        System.out.println("Benvenuto all'atm, ora dimmi cosa vuoi fare");

        int cmd = 0;
        do {
            Console.print("Dammi comando");
            cmd = Console.readInt();

            switch (cmd)
            {
                case 1-> prelievoAtm(atm);
                case 2-> depositoAtm(atm);
                case 3-> saldoAtm(atm);
                case -1-> Console.print("CIAO E ADDIO");
                default-> Console.print("Metti comando vero");
            }


        }while (cmd!=-1);

    }

    private static void saldoAtm(Atm atm)
    {
        Console.print("Il tuo saldo è "+atm.saldoRimanente()+" euro");
    }

    private static void depositoAtm(Atm atm)
    {
        Console.print("Quanto vuoi depositare");
        while (true)
        {

            try {
                atm.deposito(Console.readDouble());
                break;
            }catch (RuntimeException e)
            {
                Console.print(e.getMessage());
                Console.print("rimettilo");
            }
        }
    }

    private static void prelievoAtm(Atm atm)
    {
        Console.print("Quanto vuoi prelievo");
        while (true)
        {

            try {
                atm.prelievo(Console.readDouble());
                break;
            }catch (RuntimeException e)
            {
                Console.print(e.getMessage());
                Console.print("rimettilo");
            }
        }
    }
}

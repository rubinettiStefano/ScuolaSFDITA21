package avvii;


import implementazioni.IOv1;
import implementazioni.IOv2;
import interfacce.LettoreDaTastiera;

public class EsempioIo
{
    static void main()
    {
        LettoreDaTastiera io = new IOv2();
        int a = io.askInt("Dammi un numero");
        System.out.println("hai inserito "+a);

    }
}

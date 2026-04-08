package interfacce;

//Serve a garantire che un oggetto sappia trasformarsi in una riga csv
public interface Csvable
{
    //deve restituire una stringa con
    //identificativo classe (per professore pro)
    //,tutte le proprietà separate da virgola
    //es professore: pro,Stefano,Rubinetti,19000,26,Java,Demonio
    String toCsv();
}

package entities;

import interfacce.Csvable;

public class Airplane implements Csvable
{
    private String targa;
    private String modello;

    public Airplane(String targa, String modello) {
        this.targa = targa;
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }

    @Override
    public String toCsv() {
        return "air,"+getTarga()+","+getModello();
    }
}

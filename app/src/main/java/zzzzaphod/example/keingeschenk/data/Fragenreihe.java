package zzzzaphod.example.keingeschenk.data;

import android.util.Log;

import java.util.ArrayList;
import java.util.Set;

public class Fragenreihe {
    private ArrayList<Frage> fragen;
    private String ergebnis;
    private Frage aktuelleFrage;
    private Frage ersteFrage;

    public Fragenreihe() {
        fragen = new ArrayList<Frage>();
        }

    public String getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(String ergebnis) {
        this.ergebnis = ergebnis;
    }

    public void setAktuelleFrage(Frage frage) {

        this.aktuelleFrage = frage;
    }

    public void addFrage(Frage frage) {
        Log.d(this.getClass().toString(), "addFrage");
        fragen.add(frage);
    }

    public Frage getAktuelleFrage() {
        return this.aktuelleFrage;
    }

    public Frage getNextFrage() {
        aktuelleFrage = aktuelleFrage.getNextFrage();
        return this.aktuelleFrage;
    }
}

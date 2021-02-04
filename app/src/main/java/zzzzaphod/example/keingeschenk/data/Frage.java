package zzzzaphod.example.keingeschenk.data;

public class Frage {
    private String frage;
    private String antwortLeft;
    private String antwortRight;
    private String antwortBottom;

    private Frage nextFrage;

    public Frage(String frage, String antwortLeft, String antwortRight, String antwortBottom) {
        this.frage = frage;
        this.antwortLeft = antwortLeft;
        this.antwortRight = antwortRight;
        this.antwortBottom = antwortBottom;
    }

    public Frage getNextFrage() {
        return nextFrage;
    }

    public void setNextFrage(Frage nextFrage) {
        this.nextFrage = nextFrage;
    }

    public String getAntwortLeft() {
        return antwortLeft;
    }

    public void setAntwortLeft(String antwortLeft) {
        this.antwortLeft = antwortLeft;
    }

    public String getAntwortRight() {
        return antwortRight;
    }

    public void setAntwortRight(String antwortRight) {
        this.antwortRight = antwortRight;
    }

    public String getAntwortBottom() {
        return antwortBottom;
    }

    public void setAntwortBottom(String antwortBottom) {
        this.antwortBottom = antwortBottom;
    }


    public String getFrage() {
        return frage;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }




}

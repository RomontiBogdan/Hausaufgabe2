package Benutzer;

import Sports.Sport;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    List<Sport> sports;

    public Benutzer(String vorName, String nachName, List<Sport> sports) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sports = sports;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sports;
    }

    public void setSport(List<Sport> sport) {
        this.sports = sport;
    }

    /**
     * Findet die Gesamtzeit für die gewählte Sporte
     * Exception - wenn die Sportearray leer ist
     * @return Die summe von Zeiten
     */
    public double kalkuliereZeit(){
        if(this.sports.size() == 0)
            throw new IndexOutOfBoundsException("Es gibt kein gewählte Sporte");
        double sum = 0;
        for(Sport sport : this.sports) {
            sum += sport.kalkuliereZeit();
        }
        return sum;
    }

    /**
     * Gibt die notwendige Zeit fur der gegebene Sport
     * Exception - wenn gegebene Sport ist null
     * @param sport
     * @return
     */
    public double kalkuliereZeit(Sport sport){
        if (sport == null)
            throw new IllegalArgumentException("Der gegebene Sport ist nicht gultig");
        return sport.kalkuliereZeit();
    }

    /**
     * Findet der Durchschnittzeit von die gewählte Sporte
     * Exception - wenn die Sportearray leer ist
     * @return der Durchschnittzeit
     */
    public double kalkuliereDurschnittzeit(){
        if(this.sports.size() == 0)
            throw new IndexOutOfBoundsException("Es gibt kein gewählte Sporte");
        return kalkuliereZeit() / this.sports.size();
    }


}

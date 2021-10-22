package Benutzer;

import Sports.Leichtathletik.Hindernislauf;
import Sports.Leichtathletik.Hochsprung;
import Sports.Mannschaftssport.Basketball;
import Sports.Mannschaftssport.Fussball;
import Sports.Sport;

import java.util.ArrayList;
import java.util.List;

class BenutzerTest {
    private List<Benutzer> benutzers;
    private List<Sport> sports;

    private void fill_data(){
        benutzers = new ArrayList<Benutzer>();
        sports = new ArrayList<Sport>();
        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
        Hochsprung hochsprung = new Hochsprung();
        Hindernislauf hindernislauf = new Hindernislauf();
        sports.add(fussball);
        sports.add(basketball);
        sports.add(hochsprung);
        sports.add(hindernislauf);
        Benutzer benutzer;
        List<Sport> benutzerSports;
        for (int i = 0; i < 4; i++){
            benutzerSports = new ArrayList<Sport>();
            for (int j = 1; j <= i; j++){
                benutzerSports.add(sports.get(j));
            }
            benutzer = new Benutzer("Ben" + String.valueOf(i), "Utzer", benutzerSports);
            benutzers.add(benutzer);
        }
    }

    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {
        this.fill_data();
        for(int i = 0; i < 4; i++){
            try {
                benutzers.get(i).kalkuliereZeit();
            }
            catch (Exception e){
                if (i == 0)
                    assert(true);
                else
                    assert(false);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void testKalkuliereZeit() {
        fill_data();
        try {
            this.benutzers.get(0).kalkuliereZeit(benutzers.get(0).sports.get(0)); //Diese Benutzer hat kein Sporte in seine Liste
        }
        catch (Exception e){
            assert(true);
        }

        try {
            this.benutzers.get(2).kalkuliereZeit(benutzers.get(2).sports.get(0));
        }
        catch (Exception e){
            assert(false);
        }
    }

    @org.junit.jupiter.api.Test
    void kalkuliereDurschnittzeit() {
        this.fill_data();
        for(int i = 0; i < 4; i++){
            try {
                benutzers.get(i).kalkuliereZeit();
            }
            catch (Exception e){
                if (i == 0)
                    assert(true);
                else
                    assert(false);
            }
        }
    }
}
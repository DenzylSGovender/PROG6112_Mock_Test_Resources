
package demohorses;
    public class RaceHorse extends Horse {//Child class/Subclass
    private int racesCompeted;

    public RaceHorse(String name, String colour, int birthYear, int racesCompeted) {
        super(name, colour, birthYear);
        this.racesCompeted = racesCompeted;
    }

    public int getRacesCompeted() {
        return racesCompeted;
    }

    public void setRacesCompeted(int racesCompeted) {
        this.racesCompeted = racesCompeted;
    }
    }



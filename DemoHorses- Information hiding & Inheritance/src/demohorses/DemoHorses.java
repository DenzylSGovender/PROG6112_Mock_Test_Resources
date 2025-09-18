
package demohorses;


public class DemoHorses {//Using this class for my main Method

      public static void main(String[] args) {
        //First instance
        Horse horse1 = new Horse("Alladin's Lamp", "Brown", 2010);
       
        //Second instance
        RaceHorse raceHorse1 = new RaceHorse("Oriental Charm", "Brown and Black", 2012, 10);

        System.out.println("Horse: " + horse1.getName() + ", Colour: " + horse1.getColour() + ", Birth Year: " + horse1.getBirthYear());
        System.out.println("Race Horse: " + raceHorse1.getName() + ", Colour: " +
                raceHorse1.getColour() + ", Birth Year: " +
                raceHorse1.getBirthYear() + ", Races Competed: " +
                raceHorse1.getRacesCompeted());

        //Get a new horse details
        horse1.setName("Royal Victory");
        raceHorse1.setRacesCompeted(15);

        System.out.println("\nAfter updating:");
        System.out.println("Horse: " + horse1.getName() + ", Colour: " + horse1.getColour() + ", Birth Year: " + horse1.getBirthYear());
        System.out.println("Race Horse: " + raceHorse1.getName() + ", Colour: " +
                raceHorse1.getColour() + ", Birth Year: " + raceHorse1.getBirthYear() +
                ", Races Competed: " + raceHorse1.getRacesCompeted());
    }
}







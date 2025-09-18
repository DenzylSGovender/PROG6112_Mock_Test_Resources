package demohorses;
public class Horse {//Parent/Super Class
    
    private String name;
    private String colour;
    private int birthYear;

    public Horse(String name, String colour, int birthYear) {
        this.name = name;
        this.colour = colour;
        this.birthYear = birthYear;
    }
    //Setup your get and set methods appropriately
    //Setup in pairs so you dont forget something
    public String getName() {//get
        return name;
    }

    public void setName(String name) {//set
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
}


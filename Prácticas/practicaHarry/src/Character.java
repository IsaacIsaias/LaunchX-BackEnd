
public class Character {
    private String name;
    private String genre;
    private String house;
    private String boggart;
    private String patronus;

    public Character() { } // Unparameterized constructor

    // Parameterized constructor
    public Character(String name, String genre, String house, String boggart, String patronus) {
        this.name = name;
        this.genre = genre;

        if (house.equals("Gryffindor") || house.equals("Hufflepuff") ||
                house.equals("Ravenclaw") || house.equals("Slytherin")) {
            this.house = house;
        } else
            this.house = "HOUSE MISSPELLED";

        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getName() { return name; }
    public String getGenre() { return genre; }
    public String getHouse() { return house; }
    public String getBoggart() { return boggart; }
    public String getPatronus() { return patronus; }

    public boolean setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setGenre(String genre) {
        if (!genre.isEmpty()) {
            this.genre = genre;
            return true;
        } else
            return false;
    }

    public boolean setHouse(String house) {
        if (!house.isEmpty() && ((house.equals("Gryffindor") || house.equals("Hufflepuff") ||
                house.equals("Ravenclaw") || house.equals("Slytherin")))) {
            this.house = house;
            return true;
        } else {
            this.house = "HOUSE MISSPELLED";
            return false;
        }
    }

    public boolean setBoggart(String boggart) {
        if (!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public String showMessage() {
        return "name: " + name +
                "\n   genre: " + genre +
                "\n   house: " + house +
                "\n   boggart: " + boggart +
                "\n   patronus: " + patronus;
    }
}

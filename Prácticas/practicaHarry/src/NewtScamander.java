
public class NewtScamander {

    protected static void newtScamander() {
        Character newt = new Character(
                "Newton Scamander",
                "Male",
                "Hufflepuff",
                "Office Job",
                "UNKNOWN"
        );

        System.out.println("name: " + newt.getName());
        System.out.println("    genre: " + newt.getGenre());
        System.out.println("    house: " + newt.getHouse());
        System.out.println("    boggart: " + newt.getBoggart());
        System.out.println("    patronus: " + newt.getPatronus());
        System.out.println();
    }
}


public class LunaLovegood {

    protected static void lunaLovegood() {
        Character loony = new Character();

        // typo: it's shown "HOUSE MISSPELLED" in the 'house' parameter by the setter
        loony.setName("Luna Scamander");
        loony.setGenre("Female");
        loony.setHouse("Raveclaw");
        loony.setBoggart("Her dead father");
        loony.setPatronus("Hare");

        System.out.println("name: " + loony.getName());
        System.out.println("    genre: " + loony.getGenre());
        System.out.println("    house: " + loony.getHouse());
        System.out.println("    boggart: " + loony.getBoggart());
        System.out.println("    patronus: " + loony.getPatronus());
        System.out.println();
    }
}

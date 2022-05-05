
public class RemusLupin {

    protected static void remusLupin() {
        // typo: it's shown "HOUSE MISSPELLED" in the 'house' parameter by the constructor
        Character remus = new Character(
                "Remus John Lupin",
                "Male",
                "Gryfindor",
                "Full moon",
                "Wolf"
        );

        System.out.println(remus.showMessage());
        System.out.println();
    }
}

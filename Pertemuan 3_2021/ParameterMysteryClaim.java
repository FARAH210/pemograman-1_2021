public class ParameterMysteryClaim {
    public static void main(String[] args) {
        String hear = "bad";
        String song = "good";
        String good = "hear";
        String walk = "talk";
        String talk = "feel";
        String feel = "walk";
        claim(feel, song, feel);
        claim(good, hear, song);
        claim(talk, "song", feel);
        claim("claim", talk, walk);
    }
    public static void claim(String hear, String good, String song) {
        System.out.println("to " + hear + " the " + song + " is " + good);
    }
}

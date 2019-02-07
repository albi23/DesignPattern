import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstinstance = null;

    private String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;


    private Singleton() {
    }

    public static Singleton getFirstinstance() {

        if (firstinstance == null) {
            if (firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Singleton.class) {
                if (firstinstance == null) {
                    firstinstance = new Singleton();
                    Collections.shuffle(firstinstance.letterList);
                }
            }
        }
        return firstinstance;
    }


    public LinkedList<String> getLetterList() {
        return firstinstance.letterList;
    }

    public LinkedList<String> getTitles(int howManyTitles) {
        LinkedList<String> titleToSend = new LinkedList<String>();
        for (int i = 0; i <= howManyTitles; i++) {
            titleToSend.add(firstinstance.letterList.remove(0));
        }
        return titleToSend;
    }
}

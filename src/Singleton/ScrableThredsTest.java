public class ScrableThredsTest {

    public static void main(String[] args){

        Runnable getTitles = new GetTheTitles();
        Runnable getTitlesAgain = new GetTheTitles();

        new Thread(getTitles).start();
        new Thread(getTitlesAgain).start();
    }
}

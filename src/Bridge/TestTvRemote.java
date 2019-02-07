public class TestTvRemote {

    public static void main(String[] args){

        RemoteButton theTv = new TvRemoteMute(new TvDevice(1,200));
        RemoteButton theTv2 = new TvRemotePause(new TvDevice(1,200));

//        RemoteButton theDvd = new TvRemotePause(new TvDevice(1,200));

        System.out.println("Test mute: ");
        theTv.buttonFivePressed();
        theTv.buttonSicPressed();
        theTv.buttonNineressed();

        System.out.println("\n test Tv with Pause");

        theTv2.buttonFivePressed();
        theTv2.buttonSicPressed();
        theTv2.buttonSicPressed();
        theTv2.buttonSicPressed();
        theTv2.buttonSicPressed();
        theTv2.buttonSicPressed();
        theTv2.buttonNineressed();
        theTv2.deviceFeedBack();


    }
}

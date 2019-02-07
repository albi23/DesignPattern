public class TvRemoteMute  extends  RemoteButton
{
    public TvRemoteMute(EnetertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNineressed() {
        System.out.println("Tv was Muted");
    }
}

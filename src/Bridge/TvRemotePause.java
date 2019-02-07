

public class TvRemotePause  extends  RemoteButton
{
    public TvRemotePause(EnetertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNineressed() {
        System.out.println("Tv was paused");
    }
}

public abstract class RemoteButton {

    private  EnetertainmentDevice theDevice;

    public RemoteButton(EnetertainmentDevice theDevice){
        this.theDevice = theDevice;
    }

    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }
    public void buttonSicPressed(){
        theDevice.buttonsixPressed();
    }

    public void deviceFeedBack(){
        theDevice.deviceFeedBack();
    }

    public abstract void buttonNineressed();
}

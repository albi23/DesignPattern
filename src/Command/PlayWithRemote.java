package DesignPatternsDerekBanas;

public class PlayWithRemote {

    public static void main(String[] args){

        ElectronicDevice newDevice = TvRemote.getDevice();
        TurnTvOn onCommand = new TurnTvOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();
    }
}

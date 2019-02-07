package DesignPatternsDerekBanas;

public class DeviceButton {

    private Command theCommand;

    public DeviceButton(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void press(){
        theCommand.execute();
    }


}

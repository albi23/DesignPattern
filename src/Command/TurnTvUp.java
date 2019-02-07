package DesignPatternsDerekBanas;

public class TurnTvUp implements Command {

    private ElectronicDevice device;

    public TurnTvUp(ElectronicDevice device){

        this.device = device;
    }


    @Override
    public void execute() {
        device.volumeUp();
    }
}

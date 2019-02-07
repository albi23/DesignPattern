package DesignPatternsDerekBanas;

public class TurnTvDown implements Command {

    private ElectronicDevice device;

    public TurnTvDown(ElectronicDevice device){

        this.device = device;
    }


    @Override
    public void execute() {
        device.volumeDown();
    }
}

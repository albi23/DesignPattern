package DesignPatternsDerekBanas;

public class TurnTvOFF implements Command {

    private ElectronicDevice device;

    public TurnTvOFF(ElectronicDevice device){

        this.device = device;
    }


    @Override
    public void execute() {
        device.off();
    }
}

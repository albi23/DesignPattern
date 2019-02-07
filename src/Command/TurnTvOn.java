package DesignPatternsDerekBanas;

public class TurnTvOn implements Command {

   private ElectronicDevice device;

    public TurnTvOn(ElectronicDevice device){

        this.device = device;
    }


    @Override
    public void execute() {
        device.on();
    }
}

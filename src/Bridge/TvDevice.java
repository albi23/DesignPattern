public class TvDevice extends  EnetertainmentDevice{


    public TvDevice(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }


    @Override
    public void buttonFivePressed() {
        System.out.println("Chanle down");
        deviceState --;
    }

    @Override
    public void buttonsixPressed() {
        System.out.println("Chanle up");
        deviceState++;

    }
}

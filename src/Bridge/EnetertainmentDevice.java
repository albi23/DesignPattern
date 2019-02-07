public abstract class EnetertainmentDevice {

    public  int deviceState;
    public  int maxSetting;
    public  int volumeSetting = 0;

    public  abstract  void buttonFivePressed();
    public  abstract  void buttonsixPressed();

    public void  deviceFeedBack(){

        if(deviceState > maxSetting || deviceState < 0){
            deviceState = 0;}
            System.out.println("On device: "+ deviceState);

    }

    public void buttonSevenPressed(){

        volumeSetting++;
        System.out.println("Volume on : "+ volumeSetting);
    }

    public void buttonEightPressed(){

        volumeSetting--;
        System.out.println("Volume on : "+ volumeSetting);
    }


}

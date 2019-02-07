package DesignPatternsDerekBanas;

public class TvRemote  {

    public static ElectronicDevice getDevice(){
        return  new Television();
    }
}

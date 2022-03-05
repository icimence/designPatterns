package BridgePattern;

public class MacOS  implements OperatingSystem{
    private boolean power =false;
    private int volume = 30;
    @Override
    public boolean isPowerOn() {
        return power;
    }

    @Override
    public void powerOn() {
        power = true;
    }

    @Override
    public void powerDown() {
        power = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void volumeUp() {
        volume ++;
    }

    @Override
    public void volumeDown() {
        volume--;
    }

    @Override
    public void introduce() {
        System.out.println("This is MacOS Operating System:");
        String temp = power ? "on" : "off";
        System.out.println("Now the power is " + temp);
        System.out.println("Volume is " + volume);
    }

    @Override
    public void startApp() {
        //这里实现MacOS的系统调用
        System.out.println("App has started on MacOS!");
    }
}

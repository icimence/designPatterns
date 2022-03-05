package BridgePattern;

public interface OperatingSystem {
    boolean isPowerOn();
    void powerOn();
    void powerDown();
    int getVolume();
    void volumeUp();
    void volumeDown();
    void introduce();
    void startApp();
}

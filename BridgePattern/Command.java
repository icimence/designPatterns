package BridgePattern;

public interface Command {
    void power();
    void volumeUp();
    void volumeDown();
    int getVolume();
}

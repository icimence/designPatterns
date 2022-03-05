package BridgePattern;

public class BasicCommand implements Command {
    protected OperatingSystem operatingSystem;

    public BasicCommand(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void power() {
        if (operatingSystem.isPowerOn())
            operatingSystem.powerDown();
        else operatingSystem.powerOn();
    }

    @Override
    public void volumeUp() {
        operatingSystem.volumeUp();
    }

    @Override
    public void volumeDown() {
        operatingSystem.volumeDown();
    }

    @Override
    public int getVolume() {
        return operatingSystem.getVolume();
    }
}

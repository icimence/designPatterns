package BridgePattern;

public class AdvancedCommand extends BasicCommand {
    public AdvancedCommand(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    public void introduce() {
        operatingSystem.introduce();
    }

    public void startApp() {
        operatingSystem.startApp();
    }
}

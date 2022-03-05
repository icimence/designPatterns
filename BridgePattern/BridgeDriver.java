package BridgePattern;

public class BridgeDriver {
    public static void main(String[] args) {
        MacOS macOS = new MacOS();
        Windows windows = new Windows();
        Linux linux = new Linux();
        testSystem(linux);
        System.out.println("--------------------------------------------");
        testSystem(macOS);
        System.out.println("--------------------------------------------");
        testSystem(windows);
    }

    public static void testSystem(OperatingSystem operatingSystem) {
        System.out.println("Test Operating System Basic Command:");
        BasicCommand basicCommand = new BasicCommand(operatingSystem);
        basicCommand.power();
        System.out.println("Now the volume of the system is: " + basicCommand.getVolume());
        basicCommand.volumeUp();

        System.out.println("Test Operating System Advanced Command:");
        AdvancedCommand advancedCommand = new AdvancedCommand(operatingSystem);
        advancedCommand.startApp();
        advancedCommand.introduce();
    }
}

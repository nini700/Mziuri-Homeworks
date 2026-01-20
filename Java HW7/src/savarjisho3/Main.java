package savarjisho3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("აშშ", "Dell", 2500.0, true);
        computer.printInfo();

        Computer.Monitor monitor = computer.new Monitor(27.0, "2560x1440", 144);
        monitor.printInfo();

        Computer.Motherboard motherboard = computer.new Motherboard(4, "DDR4", 3200);
        motherboard.printInfo();
    }
}
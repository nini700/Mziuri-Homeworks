public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }
    public void displayTimeShort() {
        System.out.printf("%02d:%02d%n", hour, minute);
    }
}
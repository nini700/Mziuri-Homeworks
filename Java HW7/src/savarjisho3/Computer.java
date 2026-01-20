package savarjisho3;

public class Computer {
    private String manufacturerCountry;
    private String brand;
    private double price;
    private boolean hasWarranty;

    public Computer(String manufacturerCountry, String brand, double price, boolean hasWarranty) {
        this.manufacturerCountry = manufacturerCountry;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
    }

    public void printInfo() {
        System.out.println(" კომპიუტერის ინფორმაცია");
        System.out.println("მწარმოებელი ქვეყანა: " + manufacturerCountry);
        System.out.println("ფირმა: " + brand);
        System.out.println("ფასი: " + price + " ლარი");
        System.out.println("გარანტია: " + (hasWarranty ? "აქვს" : "არ აქვს"));
    }

    public class Monitor {
        private double diagonalInches;
        private String resolution;
        private int refreshRate;

        public Monitor(double diagonalInches, String resolution, int refreshRate) {
            this.diagonalInches = diagonalInches;
            this.resolution = resolution;
            this.refreshRate = refreshRate;
        }

        public void printInfo() {
            System.out.println("\n მონიტორის ინფორმაცია");
            System.out.println("დიაგონალი: " + diagonalInches + " დუიმი");
            System.out.println("რეზოლუცია: " + resolution + " პიქსელი");
            System.out.println("განახლების სიხშირე: " + refreshRate + " ჰერცი");
        }
    }

    public class Motherboard {
        private int ramSlots;
        private String ramType;
        private int fsbSpeed;

        public Motherboard(int ramSlots, String ramType, int fsbSpeed) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }

        public void printInfo() {
            System.out.println("\n--- დედაპლატის ინფორმაცია ---");
            System.out.println("RAM სლოტების რაოდენობა: " + ramSlots);
            System.out.println("RAM ტიპი: " + ramType);
            System.out.println("FSB სიხშირე: " + fsbSpeed + " MHz");
        }
    }
}
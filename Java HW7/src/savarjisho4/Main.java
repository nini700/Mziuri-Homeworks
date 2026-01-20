package savarjisho4;

public class Main {
    public static void main(String[] args) {
        Notification sms = new Notification("599123456", "595987654", "გამარჯობა, როგორ ხარ?") {
            @Override
            public void send() {
                System.out.println("=== SMS გაგზავნა ===");
                System.out.println("გამგზავნი: " + sender);
                System.out.println("მიმღები: " + receiver);
                System.out.println("შეტყობინება: " + messageText);
                System.out.println("SMS წარმატებით გაიგზავნა!");
            }

            @Override
            public void receive() {
                System.out.println("\n=== SMS მიღება ===");
                System.out.println("მიმღები: " + receiver);
                System.out.println("გამგზავნიდან: " + sender);
                System.out.println("შეტყობინება: " + messageText);
                System.out.println("SMS წარმატებით მიღებულია!");
            }
        };

        sms.send();
        sms.receive();
    }
}
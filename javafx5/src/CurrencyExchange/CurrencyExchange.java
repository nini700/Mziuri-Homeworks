package CurrencyExchange;

public class CurrencyExchange {

    private static final double GEL = 1.0;
    private static final double USD = 2.65;
    private static final double GBP = 3.35;
    private static final double EUR = 2.90;

    public static double getRate(String currency) {
        switch (currency) {
            case "GEL": return GEL;
            case "USD": return USD;
            case "GBP": return GBP;
            case "EUR": return EUR;
            default: return 1.0;
        }
    }

    public static double convert(double amount, String from, String to) {
        if (from == null || to == null) return 0;
        if (from.equals(to)) return amount;

        double amountInGel = amount * getRate(from);
        return amountInGel / getRate(to);
    }
}
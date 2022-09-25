package currencyconverterhw;

import currencyconverterhw.currencies.AustralianDollar;

public class Main {
    public static void main(String[] args) {
        AustralianDollar myAustralianCurrency = new AustralianDollar();
        CurrencyType myUSCurrency = CurrencyType.US_DOLLAR;
        System.out.println(myAustralianCurrency.convert(myUSCurrency));
    }
}

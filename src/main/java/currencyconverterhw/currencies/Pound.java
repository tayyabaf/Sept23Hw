package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class Pound implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.POUND;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/CurrencyType.POUND.getRate();
        return exchangeRate;
    }
}

package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class Franc implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.FRANC;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/CurrencyType.FRANC.getRate();
        return exchangeRate;
    }
}
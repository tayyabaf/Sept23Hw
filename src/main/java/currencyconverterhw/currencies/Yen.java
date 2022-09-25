package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class Yen implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.YEN;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/ctype.getRate();
        return exchangeRate;
    }
}
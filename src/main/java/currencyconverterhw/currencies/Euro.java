package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class Euro implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.EURO;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/CurrencyType.EURO.getRate();
        return exchangeRate;
    }
}
package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class UniversalCurrency implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.UNIVERSAL_CURRENCY;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/ctype.getRate();
        return exchangeRate;
    }
}
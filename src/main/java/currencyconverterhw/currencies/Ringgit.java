package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class Ringgit implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.RINGGIT;

    public Double convert(CurrencyType currencyType){
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/CurrencyType.US_DOLLAR.getRate();
        return exchangeRate;
    }
}
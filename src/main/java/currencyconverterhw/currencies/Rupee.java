package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class Rupee implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.RUPEE;

    public Double convert(CurrencyType currencyType){
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/CurrencyType.RUPEE.getRate();
        return exchangeRate;
    }
}
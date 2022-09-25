package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class SingaporeDollar implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.SINGAPORE_DOLLAR;

    public Double convert(CurrencyType currencyType){
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/ctype.getRate();
        return exchangeRate;
    }
}
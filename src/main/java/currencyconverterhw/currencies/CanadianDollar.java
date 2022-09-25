package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class CanadianDollar implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.CANADIAN_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double exchangeRate = currencyType.getRate()/CurrencyType.CANADIAN_DOLLAR.getRate();
        return exchangeRate;
    }

}

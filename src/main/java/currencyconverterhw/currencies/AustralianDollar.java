package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class AustralianDollar implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.AUSTRALIAN_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double exchangeRate = currencyType.getRate()/CurrencyType.AUSTRALIAN_DOLLAR.getRate();

        return exchangeRate;
    }

}

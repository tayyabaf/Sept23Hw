package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class USDollar implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.US_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double value = currencyType.getRate()/CurrencyType.US_DOLLAR.getRate();

        return value;
    }

    public CurrencyType getCtype() {
        return ctype;
    }
}
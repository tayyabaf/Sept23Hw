package currencyconverterhw.currencies;

import currencyconverterhw.ConvertableCurrency;
import currencyconverterhw.CurrencyType;
public class ChineseYR implements ConvertableCurrency {
    private CurrencyType ctype = CurrencyType.CHINESE_YR;

    public Double convert(CurrencyType currencyType){
        Double exchangeRate;
        exchangeRate = currencyType.getRate()/CurrencyType.CHINESE_YR.getRate();
        return exchangeRate;
    }
}
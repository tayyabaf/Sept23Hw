package currencyconverterhw;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return Double.MAX_VALUE;
    }
}
package sda.Strategia;

import java.math.BigDecimal;

public class TaxDe implements TaxStrategy{
    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.30));
    }
}

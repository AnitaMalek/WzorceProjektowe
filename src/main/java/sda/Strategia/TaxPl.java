package sda.Strategia;

import java.math.BigDecimal;

public class TaxPl implements TaxStrategy{

    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.23));
    }
}

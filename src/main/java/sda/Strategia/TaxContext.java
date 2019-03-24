package sda.Strategia;

import java.math.BigDecimal;

public class TaxContext {

    private TaxStrategy taxStrategy;

    public TaxContext(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public BigDecimal calculateTax(BigDecimal value){
        return taxStrategy.calculate(value);
    }
}

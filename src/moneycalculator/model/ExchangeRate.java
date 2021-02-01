
package moneyCalculator.model;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final Double amount;

    public ExchangeRate(Currency from, Currency to, Double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Double getAmount() {
        return amount;
    }
    
    
}

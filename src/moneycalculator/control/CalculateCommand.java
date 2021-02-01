package moneycalculator.control;

import moneyCalculator.model.Currency;
import moneyCalculator.model.Money;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.ui.MoneyDialog;
import moneycalculator.ui.MoneyDisplay;

public class CalculateCommand implements Command{

    private final MoneyDisplay moneyDisplay;
    private final MoneyDialog monayDialog;
    private final ExchangeRateLoader loader;
    private Currency eur = new Currency("EUR", "Euro", "€");

    public CalculateCommand(MoneyDisplay moneyDisplay, MoneyDialog monayDialog, ExchangeRateLoader loader) {
        this.moneyDisplay = moneyDisplay;
        this.monayDialog = monayDialog;
        this.loader = loader;
    }
    

    @Override
    public String name() {
        return "calculate";
    }

    @Override
    public void execute() {
        moneyDisplay.display(exchange(monayDialog.get()));
    }

    private Money exchange(Money money) {
        return new Money(money.getAmount() * rateOf(money.getCurrency()), eur);
    }

    private double rateOf(Currency currency) {
        return loader.load(currency, eur).getAmount();
    }
    
}

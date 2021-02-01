/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.persistence;

import moneyCalculator.model.Currency;

/**
 *
 * @author crist
 */
public interface CurrencyListLoader {
    Currency [] currencies();
}


package com.tenzin.flooring.dao;

import com.tenzin.flooring.dto.FMTax;

/**
 *
 * @author Tenzin Woesel
 * Jun 25, 2020
 */
public interface FMTaxDao {
    
    public FMTax addTax(FMTax tax);
    
    public FMTax getTax(String stateName);
    
    public FMTax updateTax(FMTax tax);
    
    public FMTax removeTax(FMTax tax);
}

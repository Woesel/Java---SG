
package com.tenzin.flooring.dto;

import java.math.BigDecimal;

/**
 *
 * @author Tenzin Woesel
 * Jun 25, 2020
 */
public class FMProduct {
    
    public String productType;
    
    public BigDecimal costPerSquareFoot;
    
    public BigDecimal laborCostPerSquareFoot;

    public FMProduct(String productType, BigDecimal costPerSquareFoot, BigDecimal laborCostPerSquareFoot) {
        this.productType = productType;
        this.costPerSquareFoot = costPerSquareFoot;
        this.laborCostPerSquareFoot = laborCostPerSquareFoot;
    }
    
    

    public String getProductType() {
        return productType;
    }

    public BigDecimal getCostPerSquareFoot() {
        return costPerSquareFoot;
    }

    public BigDecimal getLaborCostPerSquareFoot() {
        return laborCostPerSquareFoot;
    }
    
    
}

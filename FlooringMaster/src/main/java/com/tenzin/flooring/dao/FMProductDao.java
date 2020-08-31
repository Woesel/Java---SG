
package com.tenzin.flooring.dao;

import com.tenzin.flooring.dto.FMProduct;

/**
 *
 * @author Tenzin Woesel
 * Jun 25, 2020
 */
public interface FMProductDao {
    
    public FMProduct addProduct(FMProduct product);
    
    public FMProduct getProduct(String productType);
    
    public FMProduct updateProduct(FMProduct product);
    
    public FMProduct removeProduct(FMProduct product);

}

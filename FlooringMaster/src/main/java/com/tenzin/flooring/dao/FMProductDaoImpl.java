package com.tenzin.flooring.dao;

import com.tenzin.flooring.dto.FMProduct;
import java.util.Map;

/**
 *
 * @author Tenzin Woesel Jul 6, 2020
 */
public class FMProductDaoImpl implements FMProductDao {

    public String DELIMITER;

    public String DATA_FOLDER;

    private String PRODUCT_FILE;

    private Map<String, FMProduct> productMap;

    @Override
    public FMProduct addProduct(FMProduct product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMProduct getProduct(String productType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMProduct updateProduct(FMProduct product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMProduct removeProduct(FMProduct product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

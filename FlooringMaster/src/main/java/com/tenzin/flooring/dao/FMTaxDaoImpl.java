package com.tenzin.flooring.dao;

import com.tenzin.flooring.dto.FMTax;
import java.util.Map;

/**
 *
 * @author Tenzin Woesel Jul 6, 2020
 */
public class FMTaxDaoImpl implements FMTaxDao {

    public String DELIMITER = ",";

    public String DATA_FOLDER;
    private String TAX_FILE;

    private Map<String, FMTax> taxMap;

    @Override
    public FMTax addTax(FMTax tax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMTax getTax(String stateName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMTax updateTax(FMTax tax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMTax removeTax(FMTax tax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void loadTaxData() {
    }

    public FMTax unmarshallTaxData(String taxAsText) {
        return null;
    }

}

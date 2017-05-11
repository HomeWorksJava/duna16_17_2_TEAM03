package hu.javagladitors.app.etlap.service.api;

import hu.javagladitors.app.etlap.datamodel.Szemely;

/**
 * @author krisztian
 */
public interface SzemelyzetService {

    public Szemely getSzemelyByID(int ID) throws NullPointerException;
    public Szemely getSzemelyByName(String name) throws NullPointerException;
    public String getKedvencEtelTipus(String szemelyNeve) throws NullPointerException;
    
}

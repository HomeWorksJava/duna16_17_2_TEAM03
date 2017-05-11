package hu.javagladitors.app.etlap.service.api;


import hu.javagladitors.app.etlap.datamodel.Ital;


/**
 * @author krisztian
 */
public interface ItalService {
    

    public Ital getItalById(int id) throws NullPointerException;
    public Ital getItalByName(String name) throws NullPointerException;

    
}

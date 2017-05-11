package hu.javagladitors.app.etlap.service.api;

import hu.javagladitors.app.etlap.datamodel.Foetel;

/**
 * @author krisztian
 */
public interface FoetelService {

    public Foetel getFoetelById(int id) throws NullPointerException;
    public Foetel getFoetelByName(String name) throws NullPointerException;

}

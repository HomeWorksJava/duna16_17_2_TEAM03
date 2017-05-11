package hu.javagladitors.app.etlap.service.api;

import hu.javagladitors.app.etlap.datamodel.Desszert;

public interface DesszertService {
    
    public Desszert getDesszertById(int id) throws NullPointerException;
    public Desszert getDesszertByName(String name) throws NullPointerException;
}

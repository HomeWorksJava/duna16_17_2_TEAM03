/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.etlap.service.api;

import hu.javagladitors.app.etlap.datamodel.Etel;

/**
 *
 * @author petike
 */
public interface EtlapService {
 
    public Etel getEtelById(int id) throws NullPointerException;
    public Etel getEtelByName(String name) throws NullPointerException;
    
}

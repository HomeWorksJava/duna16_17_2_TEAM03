/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.etlap.service.memory;

import hu.javagladitors.app.etlap.datamodel.Etel;
import hu.javagladitors.app.etlap.service.api.EtlapService;

/**
 *
 * @author petike
 */
public class EtlapServiceImpl implements EtlapService{

    @Override
    public Etel getEtelById(int id) throws NullPointerException {
        for (int i = 0; i < DataStore.etlap.getEtlap().size(); i++) {
            if (DataStore.etlap.getEtlap().get(i).getID() == id) {
                return DataStore.etlap.getEtlap().get(i);
            }
        }
        return null;
    }

    @Override
    public Etel getEtelByName(String name) throws NullPointerException {
        for (int i = 0; i < DataStore.etlap.getEtlap().size(); i++) {
            if (DataStore.etlap.getEtlap().get(i).getNev().equals(name)) {
                return DataStore.etlap.getEtlap().get(i);
            }
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.etlap.service.memory;

import hu.javagladitors.app.etlap.datamodel.EtelTipus;
import hu.javagladitors.app.etlap.datamodel.Szemely;
import hu.javagladitors.app.etlap.service.api.SzemelyzetService;

/**
 *
 * @author petike
 */
public class SzemelyzetServiceImpl implements SzemelyzetService{

    @Override
    public Szemely getSzemelyByID(int ID) throws NullPointerException {
        for (int i = 0; i < DataStore.szemelyzet.getSzemelyzet().size(); i++) {
            if (DataStore.szemelyzet.getSzemelyzet().get(i).getID() == ID) {
                return DataStore.szemelyzet.getSzemelyzet().get(i);
            }
        }
        return null;
    }

    @Override
    public Szemely getSzemelyByName(String name) throws NullPointerException {
        for (int i = 0; i < DataStore.szemelyzet.getSzemelyzet().size(); i++) {
            if (DataStore.szemelyzet.getSzemelyzet().get(i).getNeve().equals(name)) {
                return DataStore.szemelyzet.getSzemelyzet().get(i);
            }
        }
        return null;
    }

    @Override
    public String getKedvencEtelTipus(String szemelyNeve) throws NullPointerException {
        return getSzemelyByName(szemelyNeve).getKedvencEtel().getTipus();
    }
    
    
}

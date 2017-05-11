/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.etlap.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author petike
 */
public class Etlap {
     private List<Etel> etlap = new ArrayList<>();

    public List<Etel> getEtlap() {
        return etlap;
    }

    public void setEtlap(List<Etel> etlap) {
        this.etlap = etlap;
    }
    
    public void addEtlap(Etel etel) {
        this.etlap.add(etel);
    }
}

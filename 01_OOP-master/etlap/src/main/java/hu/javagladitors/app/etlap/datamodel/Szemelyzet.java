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
public class Szemelyzet {
    private List<Szemely> szemelyzet = new ArrayList<>();

    public List<Szemely> getSzemelyzet() {
        return szemelyzet;
    }

    public void setSzemelyzet(List<Szemely> szemelyzet) {
        this.szemelyzet = szemelyzet;
    }
    
    public void addSzemely(Szemely szemely) {
        this.szemelyzet.add(szemely);
    }
}

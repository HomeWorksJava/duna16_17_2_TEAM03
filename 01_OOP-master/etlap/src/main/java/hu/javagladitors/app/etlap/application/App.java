/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.etlap.application;

import hu.javagladitors.app.etlap.service.memory.DataStore;
import hu.javagladitors.app.etlap.service.memory.SzemelyzetServiceImpl;

/**
 *
 * @author petike
 */
public class App {
    
    public static void main(String args[])
    {
        //System.out.println("Hello");
        System.out.println(DataStore.szemelyzet.getSzemelyzet().get(0).getNeve());
        SzemelyzetServiceImpl szemelyzet = new SzemelyzetServiceImpl();
        System.out.println(szemelyzet.getSzemelyByID(1).getKedvencEtel().toString());
    }
}

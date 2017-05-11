/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.etlap.datamodel;

/**
 *
 * @author petike
 */
public abstract class Etel {
    int ID;
    String neve;
    EtelTipus tipus;
    public Etel(int ID, String nev, EtelTipus tipus)
    {
        this.ID = ID;
    this.neve=nev;
    this.tipus = tipus;
    }
    
    public int getID()
    {return this.ID;}
    
    public String getNev(){
    return this.neve;
    }
    
    public String getTipus(){
    return this.tipus.toString();
    }
  
    @Override
    public String toString()
    {
    return this.neve + ", ez egy " + this.tipus.toString().toLowerCase();
    }
    
  }


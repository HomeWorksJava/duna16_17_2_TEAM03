package hu.javagladitors.app.etlap.datamodel;

public class Szemely {

    protected long ID;
    protected int szuletesiEv;
    private String szuletesiHely;
    private String neve;
    private Etel kedvencEtel;
    
    
    public Szemely(long ID, int szuletesiEv, String szuletesiHely, String neve) {
        this.ID = ID;
        this.szuletesiEv = szuletesiEv;
        this.szuletesiHely = szuletesiHely;
        this.neve = neve;
    }

    public Szemely(long ID, int szuletesiEv, String szuletesiHely, String neve, Etel kedvencEtel) {
        this.ID = ID;
        this.szuletesiEv = szuletesiEv;
        this.szuletesiHely = szuletesiHely;
        this.neve = neve;
        this.kedvencEtel = kedvencEtel;
    }
    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public void setSzuletesiEv(int szuletesiEv) {
        this.szuletesiEv = szuletesiEv;
    }

    public String getSzuletesiHely() {
        return szuletesiHely;
    }

    public void setSzuletesiHely(String szuletesiHely) {
        this.szuletesiHely = szuletesiHely;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public Etel getKedvencEtel()
    {
    return this.kedvencEtel;
    }
    
    public void setKedvencEtel(Etel etel)
    {
    this.kedvencEtel = etel;
    }
    
}

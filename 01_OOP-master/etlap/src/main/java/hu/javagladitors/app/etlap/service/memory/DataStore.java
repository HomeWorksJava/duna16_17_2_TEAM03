package hu.javagladitors.app.etlap.service.memory;

import hu.javagladitors.app.etlap.datamodel.Szemely;
import hu.javagladitors.app.etlap.datamodel.Szemelyzet;
import hu.javagladitors.app.etlap.datamodel.Etlap;
import hu.javagladitors.app.etlap.datamodel.Ital;
import hu.javagladitors.app.etlap.datamodel.Desszert;
import hu.javagladitors.app.etlap.datamodel.EtelTipus;
import hu.javagladitors.app.etlap.datamodel.Foetel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author krisztian
 */
public class DataStore {

    public static final Szemelyzet szemelyzet = new Szemelyzet();
    public static final Etlap etlap = new Etlap();
    
    static {
        etlap.addEtlap(new Desszert(1, "Csokoládés puding", EtelTipus.DESSZERT));
        etlap.addEtlap(new Desszert(2, "Meggyes pite", EtelTipus.DESSZERT));
        etlap.addEtlap(new Desszert(3, "Tápiókapuding", EtelTipus.DESSZERT));
        
        etlap.addEtlap(new Foetel(4, "Sajtos makaróni", EtelTipus.FOETEL));
        etlap.addEtlap(new Foetel(5, "Rántotta", EtelTipus.FOETEL));
        etlap.addEtlap(new Foetel(6, "Wellington bélszín", EtelTipus.FOETEL));
        etlap.addEtlap(new Foetel(7, "Szűzpecsenye", EtelTipus.FOETEL));
        etlap.addEtlap(new Foetel(8, "Kebimbó", EtelTipus.FOETEL));
        etlap.addEtlap(new Foetel(9, "Halbőr", EtelTipus.FOETEL));
        
        etlap.addEtlap(new Ital(10, "Gin", EtelTipus.ITAL));
        etlap.addEtlap(new Ital(11, "Tea", EtelTipus.ITAL));
        etlap.addEtlap(new Ital(12, "Kakaó", EtelTipus.ITAL));
        etlap.addEtlap(new Ital(13, "Cabernet Sauvignon", EtelTipus.ITAL));
        etlap.addEtlap(new Ital(14, "Cabernet Blanc", EtelTipus.ITAL));
        
        szemelyzet.addSzemely(new Szemely(1, 1990, "Valahol", "Lady Lavender Southwick", 
                new EtlapServiceImpl().getEtelByName("Gin")));
        szemelyzet.addSzemely(new Szemely(2, 1990, "Valahol", "Lord George Meldrum"));
        szemelyzet.addSzemely(new Szemely(3, 1990, "Valahol", "Teddy Meldrum"));
        szemelyzet.addSzemely(new Szemely(4, 1990, "Valahol", "Poppy Meldrum"));
        szemelyzet.addSzemely(new Szemely(5, 1990, "Valahol", "Cissy Meldrum"));
        szemelyzet.addSzemely(new Szemely(6, 1990, "Valahol", "Alf Stokes",
                new EtlapServiceImpl().getEtelByName("Cabernet Sauvignon")));
        szemelyzet.addSzemely(new Szemely(7, 1990, "Valahol", "James Twelvetrees"));
        szemelyzet.addSzemely(new Szemely(8, 1990, "Valahol", "Ivy Teasdale",
                new EtlapServiceImpl().getEtelByName("Kakaó")));
        szemelyzet.addSzemely(new Szemely(9, 1990, "Valahol", "Mrs. Blanche Lipton"));
        szemelyzet.addSzemely(new Szemely(10, 1990, "Valahol", "Henry Livingstone",
                new EtlapServiceImpl().getEtelByName("Csokoládés puding")));
        szemelyzet.addSzemely(new Szemely(11, 1990, "Valahol", "Mabel Wheeler",
                new EtlapServiceImpl().getEtelByName("Halbőr")));
        szemelyzet.addSzemely(new Szemely(12, 1990, "Valahol", "Wilson kapitány",
                new EtlapServiceImpl().getEtelByName("Meggyes pite")));
    }
}

package sk.upjs.ics.zapisnikcitatov;

import java.util.List;
import java.util.Set;


public interface CitatDao {

    Citat dajNahodnyCitat();

    List<Citat> dajVsetkyCitaty();
    
}

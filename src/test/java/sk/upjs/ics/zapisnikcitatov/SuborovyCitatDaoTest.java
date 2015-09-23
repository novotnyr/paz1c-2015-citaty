
package sk.upjs.ics.zapisnikcitatov;

import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SuborovyCitatDaoTest {
    private SuborovyCitatDao citatDao;
    
    @Before
    public void setUp() {
        citatDao = new SuborovyCitatDao();        
    }

    @Test
    public void testDajNahodnyCitat() {
        Citat nahodnyCitat = citatDao.dajNahodnyCitat();
        
        System.out.println(nahodnyCitat);        
    }

    @Test
    public void testDajVsetkyCitaty() {
        SuborovyCitatDao citatDao = new SuborovyCitatDao();
        Set<Citat> vsetkyCitaty = citatDao.dajVsetkyCitaty();
        assertTrue(vsetkyCitaty.size() > 0);
    }

}
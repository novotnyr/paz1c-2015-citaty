
package sk.upjs.ics.zapisnikcitatov;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author rn
 */
public class DatabazovyCitatDaoTest {
    private DatabazovyCitatDao databazovyCitatDao;

    @Before
    public void setUp() {
         databazovyCitatDao = new DatabazovyCitatDao();
    }
    
    @Test
    public void testDajNahodnyCitat() {
        Assert.assertNotNull(databazovyCitatDao.dajNahodnyCitat());
    }

    @Test
    public void testDajVsetkyCitaty() {
        List<Citat> vsetkyCitaty = databazovyCitatDao.dajVsetkyCitaty();
        Assert.assertEquals(2, vsetkyCitaty.size());
    }

}
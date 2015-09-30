package sk.upjs.ics.zapisnikcitatov;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import java.util.Set;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class DatabazovyCitatDao implements CitatDao {
   
    private JdbcTemplate jdbcTemplate;

    public DatabazovyCitatDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("citaty");
        dataSource.setPassword("citaty");
        dataSource.setUrl("jdbc:mysql://localhost/citaty");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public Citat dajNahodnyCitat() {
        BeanPropertyRowMapper<Citat> mapper = new BeanPropertyRowMapper<>(Citat.class);

        String sql = "SELECT znenie AS `text`, autor \n" +
            "FROM citat\n" +
            "ORDER BY RAND() LIMIT 0, 1";
        
        return jdbcTemplate.queryForObject(sql, mapper);
    }

    @Override
    public List<Citat> dajVsetkyCitaty() {
        BeanPropertyRowMapper<Citat> mapper = new BeanPropertyRowMapper<>(Citat.class);
        return jdbcTemplate.query("SELECT znenie AS `text`, autor FROM citat", mapper);
    }

}

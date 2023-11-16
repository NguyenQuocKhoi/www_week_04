package vn.edu.iuh.fit.repositories;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.models.Candidate;

@Component
public class CandidateDao extends AbstractDao<Candidate, Long> {

  private JdbcTemplate jdbcTemplate;
  private DataSource dataSource;

  public CandidateDao(DataSource dataSource){
    this.dataSource = dataSource;
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
  @Override
  public void insert(Candidate candidate) {
    String query = "insert into Candidate value (?,?,?,?)";
    jdbcTemplate.update(query, candidate.getCan_id(), candidate.getName(), candidate.getEmail(), candidate.getPhone());
  }

  @Override
  public void update(Candidate candidate) {

  }

  @Override
  public void delete(Candidate candidate) {

  }

  @Override
  public Candidate findById(Long id) {
    String query = "Select * from Candidate where can_id=?";
    return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Candidate.class),id);
  }

  @Override
  public List<Candidate> getAll() {
    return null;
  }
}

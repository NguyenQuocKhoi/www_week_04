package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.repositories.CandidateDao;

@SpringBootApplication
public class Week04Application {

  public static void main(String[] args) {
    SpringApplication.run(Week04Application.class, args);
  }

  @Autowired
  private CandidateDao candidateDao;

//  @Bean
  public CommandLineRunner createSampleCandidate(){
    return new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
        Candidate candidate = new Candidate(1, "Khoi", "khoi@email.com", "123456789");
        candidateDao.insert(candidate);
      }
    };
  }
  @Bean
  public CommandLineRunner findCandidateByID(){
    return new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
//        Candidate candidate = new Candidate(1, "Khoi", "khoi@email.com", "123456789");
//        candidateDao.insert(candidate);
        long id = 1;
        System.out.println(candidateDao.findById(id));
      }
    };
  }

}

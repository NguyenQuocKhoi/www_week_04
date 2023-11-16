package vn.edu.iuh.fit.models;

public class CandidateSkill {

  private String level;

  private Candidate candidate;

  private Skill skill;

  public CandidateSkill() {
  }

  public CandidateSkill(String level, Candidate candidate, Skill skill) {
    this.level = level;
    this.candidate = candidate;
    this.skill = skill;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Candidate getCandidate() {
    return candidate;
  }

  public void setCandidate(Candidate candidate) {
    this.candidate = candidate;
  }

  public Skill getSkill() {
    return skill;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }

  @Override
  public String toString() {
    return "CandidateSkill{" +
        "level='" + level + '\'' +
        ", candidate=" + candidate +
        ", skill=" + skill +
        '}';
  }


}

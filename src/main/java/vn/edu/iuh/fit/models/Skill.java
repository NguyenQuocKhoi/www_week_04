package vn.edu.iuh.fit.models;

public class Skill {
  private long skill_id;

  private String name;

  public Skill() {
  }

  public Skill(long skill_id, String name) {
    this.skill_id = skill_id;
    this.name = name;
  }

  public long getSkill_id() {
    return skill_id;
  }

  public void setSkill_id(long skill_id) {
    this.skill_id = skill_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Skill{" +
        "skill_id=" + skill_id +
        ", name='" + name + '\'' +
        '}';
  }


}

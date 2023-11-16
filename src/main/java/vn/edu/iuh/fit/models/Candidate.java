package vn.edu.iuh.fit.models;

public class Candidate {
  private long can_id;

  private String name;

  private String email;

  private String phone;

  public Candidate() {
  }

  public Candidate(long can_id, String name, String email, String phone) {
    this.can_id = can_id;
    this.name = name;
    this.email = email;
    this.phone = phone;
  }

  public long getCan_id() {
    return can_id;
  }

  public void setCan_id(long can_id) {
    this.can_id = can_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Candidate{" +
        "can_id=" + can_id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }
}

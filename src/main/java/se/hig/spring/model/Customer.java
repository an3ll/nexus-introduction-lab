package se.hig.spring.model;

import java.util.Date;

public class Customer {

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String mobile;
  private Date dateOfBirth;

  public Customer(long id, String firstName, String lastName, String email, String mobile) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.mobile = mobile;
    this.dateOfBirth = new Date();
  }

  public Customer() {
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(final String mobile) {
    this.mobile = mobile;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}

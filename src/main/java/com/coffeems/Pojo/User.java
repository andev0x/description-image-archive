package com.coffeems.Pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "user")
public class User implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;


  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "contactNumber")
  private String contactNumber;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "status")
  private String status;

  @Column(name = "role")
  private String role;

  public User(Integer id) {
    this.id = id;
  }

  public User(String name, String contactNumber, String email, String password, String status,
      String role) {
    this.name = name;
    this.contactNumber = contactNumber;
    this.email = email;
    this.password = password;
    this.status = status;
    this.role = role;
  }

  public User() {

  }
}

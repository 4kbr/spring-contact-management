package com.example.contacts.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User implements Serializable {
  private static final long serialVersionUID = 2318387918066589115L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false, columnDefinition = "varchar(100)", name = "username")
  private String username;
  @Column(nullable = false, columnDefinition = "varchar(100)", name = "password")
  private String password;
  @Column(nullable = false, columnDefinition = "varchar(100)", name = "name")
  private String name;
  @Column(name = "token")
  private String token;
  @Column(name = "token_expired_at")
  private Long tokenExpiredAt;

  @OneToMany(mappedBy = "user")
  private List<Contact> contacts;

}

package com.example.contacts.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "contacts")
public class Contact implements Serializable {
  private static final long serialVersionUID = 6468074226514158247L;

  @Id
  @Column(name = "id", columnDefinition = "VARCHAR(100)", nullable = false)
  private String id;
  @Column(name = "first_name", columnDefinition = "VARCHAR(100)", nullable = false)
  private String first_name;
  @Column(name = "last_name", columnDefinition = "VARCHAR(100)")
  private String last_name;
  @Column(name = "phone", columnDefinition = "VARCHAR(100)")
  private String phone;
  @Column(name = "email", columnDefinition = "VARCHAR(100)")
  private String email;

  // @Column(name = "user_id", columnDefinition = "BIGINT", nullable = false)
  // private Long user_id;
  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;

  @OneToMany(mappedBy = "contact")
  private List<Address> addresses;
}

package com.example.contacts.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "addresses")
public class Address implements Serializable {
  private static final long serialVersionUID = -6906995597332890980L;

  @Id
  private String id;

  @Column(name = "street", columnDefinition = "VARCHAR(200)")
  private String street;
  @Column(name = "city", columnDefinition = "VARCHAR(100)")
  private String city;
  @Column(name = "province", columnDefinition = "VARCHAR(100)")
  private String province;
  @Column(name = "country", columnDefinition = "VARCHAR(100)", nullable = false)
  private String country;
  @Column(name = "postal_code", columnDefinition = "VARCHAR(10)")
  private String postalCode;

  // @Column(name = "contact_id", columnDefinition = "VARCHAR(100) NOT NULL")
  // private String contactId;
  @ManyToOne
  @JoinColumn(name = "contact_id", referencedColumnName = "id")
  private Contact contact;

}

package com.sageapp.dishit.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "users")
@NoArgsConstructor
public class UserDAO {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  String username;
  String password;
  String firstName;
  String lastName;
  String email;
  Date createdAt;
  Date updatedAt;
}

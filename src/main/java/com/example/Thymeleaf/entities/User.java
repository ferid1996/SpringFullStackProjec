package com.example.Thymeleaf.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "uuuuu")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     String username;
     String password;
     String email;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
     List<Product> cart;
}

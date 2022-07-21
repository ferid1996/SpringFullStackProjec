package com.example.Thymeleaf.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "ssss")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String name;
     String description;
     Double price;
    @Lob
    String picture;

}

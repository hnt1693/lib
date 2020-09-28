package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "type_of_book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeOfBook implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String name;
    @OneToMany(targetEntity = Book.class)
    @JoinTable(name = "book_type")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    List<Book> books;
}

package models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="books")
@Getter @Setter
@ToString
public class Book {
    @Id
    @Column
    private Long id;

    private String title;
    private String author;
    private String releaseDate;
    private Double price;
    private int stock;

}

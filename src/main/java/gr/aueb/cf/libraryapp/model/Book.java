package gr.aueb.cf.libraryapp.model;

import gr.aueb.cf.libraryapp.model.static_data.Category;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book extends AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String isbn;

    @Column(unique = true)
    private String uuid;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 255)
    private String author;

    @Column(name = "publication_year")
    private Integer publicationYear;

    @Column(length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @PrePersist//όποτε γίνεται input ενός book δημιουργείται αυτόματα ενα uuid
    public void initializeUUID(){
        if (uuid == null) uuid = UUID.randomUUID().toString();
    }
}

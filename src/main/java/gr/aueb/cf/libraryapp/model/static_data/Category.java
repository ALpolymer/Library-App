package gr.aueb.cf.libraryapp.model.static_data;

import gr.aueb.cf.libraryapp.model.AbstractEntity;
import gr.aueb.cf.libraryapp.model.Book;
import jakarta.persistence.*;
import lombok.*;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Getter(AccessLevel.PRIVATE)
    @OneToMany(mappedBy = "category")
    private Set<Book> books = new HashSet<>();

    // convenient methods
    public Set<Book> getAllBooks(){
        return Collections.unmodifiableSet(books);
    }

    public void addBook(Book book){
        if(books == null) books = new HashSet<>();
        books.add(book);
        book.setCategory(this);
    }

    public void removeBook(Book book){
        if(books == null) return;
        books.remove(book);
        book.setCategory(null);
    }
}

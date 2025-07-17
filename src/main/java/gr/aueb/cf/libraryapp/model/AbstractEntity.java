package gr.aueb.cf.libraryapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@MappedSuperclass//δεν γίνεται πίνακας.Απλά δηλώνω κοινά πεδία που θα κληρονομηθόυν από τα άλλα entities
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)//Ενεργοποίηση Auditing
public abstract class AbstractEntity {

    @CreatedDate//Auditing
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate//Auditing
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}

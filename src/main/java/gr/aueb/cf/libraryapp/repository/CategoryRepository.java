package gr.aueb.cf.libraryapp.repository;

import gr.aueb.cf.libraryapp.model.static_data.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

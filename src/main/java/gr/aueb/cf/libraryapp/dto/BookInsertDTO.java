package gr.aueb.cf.libraryapp.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookInsertDTO {
    @NotBlank(message = "Title field must be filled")
    @Size(min=2, max=255, message = "Title must have from 2 to 255 characters")
    private String title;

    @NotBlank(message = "Author field must be filled")
    @Size(min=2, max=255, message = "Author must have from 2 to 255 characters")
    private String author;

    @NotNull(message = "Category must be selected")
    private Long categoryId;

    @Pattern(regexp = "\\d{10,13}", message = "ISBN must contain from 10 to 13 digits")
    private String isbn;

    @Min(value = 1000, message = "Publication year must be after 1000")
    @Max(value = 2030, message = "Publication year cannot be in the future")
    private Integer publicationYear;

    @Size(max = 1000, message = "Description must not exceed 1000 characters")
    private String description;
}

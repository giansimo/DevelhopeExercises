package co.develhope.bookexample.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BookDTO {

    @NotBlank(message = "Title may not be blank")
    private String title;

    @NotBlank(message = "Author not blank")
    private String author;

    @NotBlank(message = "ISBN may not be blank")
    private String isbn;

    private boolean isAMasterpiece;
}

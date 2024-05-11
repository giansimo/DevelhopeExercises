package co.develhope.bookExampleWithDTO.Mapper;

import co.develhope.bookExampleWithDTO.DTO.BookCreationDTO;
import co.develhope.bookExampleWithDTO.entities.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookCreationDTO toDto(Book book) {
        return new BookCreationDTO(book.getTitle(),
                book.getAuthor(),
                book.getIsbn(),
                book.isIsAMasterpiece());
    }

    public Book toBook(BookCreationDTO bookDTO) {
        return new Book(
                bookDTO.getTitle(),
                bookDTO.getAuthor(),
                bookDTO.getIsbn(),
                bookDTO.isAMasterpiece());
    }
}

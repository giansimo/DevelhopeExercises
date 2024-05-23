package co.develhope.bookExampleWithDTO.services;

import co.develhope.bookExampleWithDTO.DAO.BookDAO;
import co.develhope.bookExampleWithDTO.DTO.BookCreationDTO;
import co.develhope.bookExampleWithDTO.DTO.BookUpdatePatchDTO;
import co.develhope.bookExampleWithDTO.Mapper.BookMapper;
import co.develhope.bookExampleWithDTO.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private BookMapper mapper;

    @Override
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    public Book getBookById(long id) {
        return bookDAO.getBookById(id);
    }

    @Override
    public Book createBook(BookCreationDTO bookDTO) {
        Book book = mapper.toBook(bookDTO);
        return bookDAO.createBook(book);
    }

    @Override
    public Book checkAndUpdateBook(Long id, BookUpdatePatchDTO bookPatch) {
        Book book = bookDAO.getBookById(id);
        if (book != null){
            if (bookPatch.getAuthor() != null){
                book.setAuthor(bookPatch.getAuthor());
            }
            if (bookPatch.getTitle() != null){
                book.setTitle(bookPatch.getTitle());
            }
            if (bookPatch.getIsbn() != null){
                book.setIsbn(bookPatch.getIsbn());
            }
            if (bookPatch.isAMasterpiece() != book.isIsAMasterpiece()){
                book.setIsAMasterpiece(bookPatch.isAMasterpiece());
            }
            return updateBook(book);
        } else {
            return null;
        }

    }

    @Override
    public Book updateBook(Book book) {
        return bookDAO.updateBook(book);
    }


    @Override
    public Book deleteBook(long id) {
        return bookDAO.deleteBook(id);
    }

    @Override
    public void deleteAllBooks() {bookDAO.deleteAllBooks();}

    @Override
    public List<Book> searchBooks(String title, String author, String isbn) {
        // Effettua la ricerca dei libri utilizzando i parametri specificati
        return bookDAO.searchBooks(title, author, isbn);
    }

}
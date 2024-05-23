package co.develhope.bookExampleWithDTO.controllers;

import co.develhope.bookExampleWithDTO.DTO.BookCreationDTO;
import co.develhope.bookExampleWithDTO.DTO.BookUpdateDTO;
import co.develhope.bookExampleWithDTO.DTO.BookUpdatePatchDTO;
import co.develhope.bookExampleWithDTO.Mapper.BookMapper;
import co.develhope.bookExampleWithDTO.entities.Book;
import co.develhope.bookExampleWithDTO.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private BookMapper mapper;


    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
        //return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        if (book != null) {
            return ResponseEntity.ok().body(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> createBook(@Valid @RequestBody BookCreationDTO bookDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
        } else {
            Book createdBook = bookService.createBook(bookDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
        }

    }

    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@Valid @RequestBody BookUpdateDTO bookDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().build();
        } else {
            Book book = mapper.toBook(bookDTO);
            Book updatedBook = bookService.updateBook(book);
            if (updatedBook != null) {
                return ResponseEntity.ok().body(updatedBook);
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @Valid @RequestBody BookUpdatePatchDTO bookDTO,
                                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().build();
        } else {
            Book updatedBook = bookService.checkAndUpdateBook(id, bookDTO);
            if (updatedBook != null) {
                return ResponseEntity.ok().body(updatedBook);
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteBook() {
        bookService.deleteAllBooks();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Long id) {
        Book book = bookService.deleteBook(id);
        if (book != null)
            return ResponseEntity.ok().body(book);
        else {
            return ResponseEntity.notFound().build();
        }
    }


}
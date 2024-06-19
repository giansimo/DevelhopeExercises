package co.develhope.bookexample;

import co.develhope.bookexample.entities.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;

@SpringBootApplication
public class BookexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookexampleApplication.class, args);
	}

}

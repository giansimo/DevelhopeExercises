package co.develhope.bookexample;

import co.develhope.bookexample.controllers.BookController;
import co.develhope.bookexample.entities.Book;
import co.develhope.bookexample.services.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(BookController.class)
class BookexampleApplicationTests {

	@MockBean
	private BookService bookService;
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void getBooks() throws Exception {
		this.mockMvc.perform( MockMvcRequestBuilders
				.get("/api/v1/books"))
				.andDo(print());
	}

	private static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Test
	void addBook() throws Exception {

		this.mockMvc.perform( MockMvcRequestBuilders
						.post("/api/v1/books/add")
						.content(asJsonString(
								new Book(null, "testTitle", "testAuthor", "testISBN")
						))
						.contentType(MediaType.APPLICATION_JSON)
				)
				.andDo(print());
	}

}

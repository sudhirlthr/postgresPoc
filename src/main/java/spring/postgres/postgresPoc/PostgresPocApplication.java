package spring.postgres.postgresPoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.postgres.postgresPoc.pojo.Book;
import spring.postgres.postgresPoc.repo.BookRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PostgresPocApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(PostgresPocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book title1 = new Book(1l, "title1", LocalDate.now());
		Book title2 = new Book(2l, "title2", LocalDate.now());
		Book title3 = new Book(3l, "title3", LocalDate.now());
		Book title4 = new Book(4l, "title4", LocalDate.now());
		Book title5 = new Book(5l, "title5", LocalDate.now());

		Iterable<Book> iterable = Arrays.asList(title1, title2, title3, title4, title5);

		bookRepository.saveAll(iterable);


	}
}


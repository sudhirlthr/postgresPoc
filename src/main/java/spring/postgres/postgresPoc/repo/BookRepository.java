package spring.postgres.postgresPoc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.postgres.postgresPoc.pojo.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

package com.my.mine.repo;

import org.springframework.data.repository.CrudRepository;
import com.my.mine.models.Books;

public interface BooksRepository  extends CrudRepository<Books, Long> {
}

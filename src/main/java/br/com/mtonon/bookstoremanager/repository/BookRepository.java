package br.com.mtonon.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mtonon.bookstoremanager.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

package br.com.mtonon.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.mtonon.bookstoremanager.domain.Book;
import br.com.mtonon.bookstoremanager.dto.MessageResponseDTO;
import br.com.mtonon.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public MessageResponseDTO create(Book book) {
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder()
				.message("Book created with id " + savedBook.getId())
				.build();
	}
	
}

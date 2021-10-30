package br.com.mtonon.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mtonon.bookstoremanager.domain.Book;
import br.com.mtonon.bookstoremanager.dto.BookDTO;
import br.com.mtonon.bookstoremanager.dto.MessageResponseDTO;
import br.com.mtonon.bookstoremanager.mapper.BookMapper;
import br.com.mtonon.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private final BookMapper bookMapper = BookMapper.INSTANCE;
	
	public MessageResponseDTO create(BookDTO bookDTO) {	
		Book bookToSave = bookMapper.fromDTO(bookDTO);
		Book savedBook = bookRepository.save(bookToSave);
		return MessageResponseDTO.builder()
				.message("Book created with id " + savedBook.getId())
				.build();
	}

	
}

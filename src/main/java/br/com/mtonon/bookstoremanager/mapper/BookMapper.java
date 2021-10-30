package br.com.mtonon.bookstoremanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.mtonon.bookstoremanager.domain.Book;
import br.com.mtonon.bookstoremanager.dto.BookDTO;

@Mapper
public interface BookMapper {

	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
	
	Book fromDTO(BookDTO bookDTO);
	
	BookDTO fromBook(Book book);
}

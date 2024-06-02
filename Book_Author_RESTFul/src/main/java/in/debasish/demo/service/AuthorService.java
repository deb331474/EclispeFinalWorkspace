package in.debasish.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.debasish.demo.entity.Author;
import in.debasish.demo.repository.AuthorRepository;

@Service

public class AuthorService {


		@Autowired
		AuthorRepository authorRepository;

		public List<Author> getAllAuthors() {
			return authorRepository.findAll();
		}

		public Author getAuthorById(Long id) {
			return authorRepository.findById(id).orElse(null);
		}

		public Author updateAuthor(Author author) {
			return authorRepository.save(author);
		}

		public void deleteById(Long id) {
			authorRepository.deleteById(id); //implement delete entire entity
		}
		
		public Author updateById(Long id, Author author){
		 Author updated_author=getAuthorById(id);
			if(updated_author != null) {
				updated_author.getId();
				updated_author.setFirstName(author.getFirstName());
				updated_author.setLastName(author.getLastName());
			        return authorRepository.save(updated_author);
			}
			return null;
		}

	}
package in.debasish.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.debasish.demo.entity.Author;
import in.debasish.demo.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping
	public List<Author> getAllAuthors(){

		return authorService.getAllAuthors();
	}

	@GetMapping("{id}")
	public ResponseEntity<Author> getbyId(@PathVariable Long id) {
		
		Author author = authorService.getAuthorById(id);
		
		if(author == null) {
			return ResponseEntity.notFound().build();
		}
		else
			return ResponseEntity.ok(author);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Author> updateAuthor(@RequestBody Author author){
		
		Author authorSaved1 = authorService.updateAuthor(author);
		
		return ResponseEntity.ok(authorSaved1);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAuthor(@PathVariable Long id){
		
		authorService.deleteById(id);
		
		return ResponseEntity.ok("Author Deleted Successfully");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Author> updateById(@PathVariable Long id, @RequestBody Author author){
		
		Author existingAuthor = authorService.getAuthorById(id);
		
		if(existingAuthor==null) {
			return ResponseEntity.notFound().build();
		}
		author.setId(id);
		
		Author updateAuthor=authorService.updateAuthor(author);
		
		return ResponseEntity.ok(updateAuthor);
	}
		
}
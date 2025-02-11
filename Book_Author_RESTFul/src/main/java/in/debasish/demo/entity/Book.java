package in.debasish.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book {

	@Column
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long bookId;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	public Book() {

	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", bookId=" + bookId + "]";
	}

}
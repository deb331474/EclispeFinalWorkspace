package in.debasish.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="Author")

public class Author {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
	private Long id;

	@Column
	private String lastName;
	
    @Column
	private String firstName;
    
    
    public Author(Long id, String lastName, String firstName) {
    	
  		this.id = id;
  		this.lastName = lastName;
  		this.firstName = firstName;
  	}

  public Author() {
    	
  	}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
	
package in.debasish.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.debasish.demo.entity.Author;

@Repository

public interface AuthorRepository extends JpaRepository<Author, Long>{

}

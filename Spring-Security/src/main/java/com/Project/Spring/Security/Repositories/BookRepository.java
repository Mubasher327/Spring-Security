package com.Project.Spring.Security.Repositories;

import com.Project.Spring.Security.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Book,Long> {

//    List<Books> findBookByBook_Id(long id);
//    List<Books> findBookByBook_Name(String name);
}

package com.Project.Spring.Security.Repositories;

import com.Project.Spring.Security.Entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Books,Long> {

//    List<Books> findBookByBook_Id(long id);
//    List<Books> findBookByBook_Name(String name);
}

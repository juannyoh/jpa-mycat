package jpa.mycat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by ssab on 17-1-5.
 */
public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
  Salesman save(Salesman salesman);

//  @Query(value = "select * from salesman limit 0,18", nativeQuery = true)
//  List<Salesman> findAll();
}

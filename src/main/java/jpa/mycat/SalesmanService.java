package jpa.mycat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ssab on 17-1-5.
 */
@Service
public class SalesmanService {

  @Autowired
  private SalesmanRepository repository;

//  @Transactional(propagation = Propagation.REQUIRED)
  public Salesman save(Salesman salesman) {
    return repository.save(salesman);
  }

//  @Transactional(propagation = Propagation.NOT_SUPPORTED)
  public List<Salesman> findAll() {
    return repository.findAll();
  }

}

package jpa.mycat;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JPAGuestDao  extends JpaRepository<Guest, String>,
JpaSpecificationExecutor<Guest> {
}

package repositories;

import models.SowDetails;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SowRepo extends JpaRepository<SowDetails,Long> {

}

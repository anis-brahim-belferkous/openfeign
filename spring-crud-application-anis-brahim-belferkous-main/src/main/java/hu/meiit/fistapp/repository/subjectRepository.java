package hu.meiit.fistapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface subjectRepository extends CrudRepository<subject,Long> {

}

package repository;

import models.College;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {
    // Additional query methods can be defined here if needed
}
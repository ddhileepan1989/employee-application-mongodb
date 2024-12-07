package org.mentorbridge.repository;

import org.mentorbridge.entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


/*public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{*/
public interface EmployeeRepository extends MongoRepository<EmployeeEntity,Long> {
    EmployeeEntity findById(long id);
}

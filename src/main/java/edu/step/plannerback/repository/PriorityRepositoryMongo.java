package edu.step.plannerback.repository;

import edu.step.plannerback.model.Priority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepositoryMongo extends MongoRepository<Priority, Long> {
}

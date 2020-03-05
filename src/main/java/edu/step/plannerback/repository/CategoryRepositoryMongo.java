package edu.step.plannerback.repository;

import edu.step.plannerback.model.Category;
import edu.step.plannerback.model.Priority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoryMongo extends MongoRepository<Category, Integer> {
}

package edu.step.plannerback.service.category.impls;

import edu.step.plannerback.model.Category;
import edu.step.plannerback.repository.CategoryRepositoryMongo;
import edu.step.plannerback.service.category.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    CategoryRepositoryMongo repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public Category create(Category category) {
        Integer lastId = this.getAll().stream()
                .mapToInt(Category::getId).max().orElse(0);
        category.setId(lastId+1);
        return repository.save(category);
    }

    @Override
    public Category get(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Category update(Category category) {
        return repository.save(category);
    }

    @Override
    public Category delete(Integer id) {
        Category category = this.get(id);
         repository.deleteById(id);
        return category;
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }


    @Override
    public void saveAll(List<Category> categories) {
        repository.saveAll(categories);
    }
}

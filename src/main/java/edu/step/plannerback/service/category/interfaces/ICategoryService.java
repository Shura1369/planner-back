package edu.step.plannerback.service.category.interfaces;

import edu.step.plannerback.model.Category;
import edu.step.plannerback.service.IGenericService;

import java.util.List;

public interface ICategoryService extends IGenericService<Category> {
    void saveAll(List<Category> categories);
}

package edu.step.plannerback.controller.rest;

import edu.step.plannerback.model.Category;
import edu.step.plannerback.model.Priority;
import edu.step.plannerback.service.category.interfaces.ICategoryService;
import edu.step.plannerback.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryRESTController {

   ICategoryService service;

   @Autowired
    public CategoryRESTController(ICategoryService service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Category> getAll(){
        return  service.getAll();
    }


    @GetMapping ("/delete/{id}")
    public Category delete(@PathVariable("id") Integer id){
        return  service.delete(id);
    }

    @PostMapping("/create")
    public Category create (@RequestBody Category category)
    {
        return  service.create(category);
    }

    @PostMapping("/update")
    public Category update (@RequestBody Category category)
    {
        return  service.update(category);
    }

    @PostMapping("/list/save")
    public void save (@RequestBody List<Category> categories)
    {
        service.saveAll(categories);
    }


}

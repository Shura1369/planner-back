package edu.step.plannerback.controller.rest;

import edu.step.plannerback.model.Priority;
import edu.step.plannerback.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/priority")
public class PriorityRESTController {

   IPriorityService service;

   @Autowired
    public PriorityRESTController(IPriorityService service) {
        this.service = service;
    }


    @RequestMapping("/list")
    public List<Priority> getAll(){
        return  service.getAll();
    }


    @GetMapping ("/delete/{id}")
    public Priority delete(@PathVariable("id") Integer id){
        return  service.delete(id);
    }

    @PostMapping("/create")
    public Priority create (@RequestBody Priority priority)
    {
        return  service.create(priority);
    }


    @PostMapping("/update")
    public Priority update (@RequestBody Priority priority)
    {
        return  service.update(priority);
    }


}

package edu.step.plannerback.controller.rest;

import edu.step.plannerback.model.Priority;
import edu.step.plannerback.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return  null;
    }


}

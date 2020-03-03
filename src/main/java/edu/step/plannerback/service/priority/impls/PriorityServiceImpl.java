package edu.step.plannerback.service.priority.impls;

import edu.step.plannerback.dao.priority.impls.PriorityDAOMongoImpl;
import edu.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import edu.step.plannerback.model.Priority;
import edu.step.plannerback.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PriorityServiceImpl implements IPriorityService {

    private final IPriorityDAO dao;

    @Autowired
    public PriorityServiceImpl(@Qualifier("mongo") IPriorityDAO dao) {
        this.dao = dao;
    }

    @Override
    public Priority create(Priority priority) {
        return null;
    }

    @Override
    public Priority get(Integer id) {
        return null;
    }

    @Override
    public Priority update(Priority priority) {
        return null;
    }

    @Override
    public Priority delete(Integer id) {
        return null;
    }

    @Override
    public List<Priority> getAll() {
        return dao.getAll();
    }
}

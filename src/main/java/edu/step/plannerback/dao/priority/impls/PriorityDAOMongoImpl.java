package edu.step.plannerback.dao.priority.impls;

import edu.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import edu.step.plannerback.model.Priority;
import edu.step.plannerback.repository.PriorityRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
@Qualifier("mongo")
public class PriorityDAOMongoImpl implements IPriorityDAO {

    private final PriorityRepositoryMongo repository;

    private List<Priority> list = new ArrayList<>(

            Arrays.asList(
                    new Priority(1,"High", "#3943e5"),
                    new Priority(2,"Medium", "#85D1B2"),
                    new Priority(3,"High", "#F1828D"),
                    new Priority(4,"Ultra high", "#F1128D"),
                    new Priority(5,"W/O", "#e5e5e5")
            )
    );



    @Autowired
    public PriorityDAOMongoImpl(PriorityRepositoryMongo repository) {
        this.repository = repository;
    }

    @PostConstruct
    void init(){
        repository.deleteAll();
        repository.saveAll(list);
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
        return repository.findAll();
    }
}

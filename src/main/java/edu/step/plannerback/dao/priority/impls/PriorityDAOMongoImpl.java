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
                    new Priority(1,"Light", "#3943e5"),
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
        Integer lastId = this.getAll().stream()
                .mapToInt(Priority::getId).max().orElse(0);
        priority.setId(lastId + 1);

        return repository.save(priority);
    }

    @Override
    public Priority get(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Priority update(Priority priority) {
        return repository.save(priority);
    }

    @Override
    public Priority delete(Integer id) {
        Priority priority = this.get(id);
        this.repository.deleteById(id);
        return priority;
    }

    @Override
    public List<Priority> getAll() {
        return repository.findAll();
    }
}

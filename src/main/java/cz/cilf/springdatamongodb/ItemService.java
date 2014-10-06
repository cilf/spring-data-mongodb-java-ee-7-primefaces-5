package cz.cilf.springdatamongodb;

import javax.ejb.Singleton;
import javax.inject.Inject;
import java.util.List;

@Singleton
public class ItemService {

    @Inject
    ItemRepository repository;

    public void save(Item item) {
        repository.save(item);
    }

    public List<Item> findAll() {
        return repository.findAll();
    }

    public void delete(Item item) {
        repository.delete(item);
    }

}

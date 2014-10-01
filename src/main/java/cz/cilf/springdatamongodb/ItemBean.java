package cz.cilf.springdatamongodb;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ItemBean implements Serializable {

    @Inject
    private ItemService service;

    private List<Item> items;

    @PostConstruct
    private void init() {
        items = service.findAll();
    }

    public void create() {
        Item item = new Item();
        items.add(item);
        service.save(item);
    }

    public void delete(Item item) {
        items.remove(item);
        service.delete(item);
    }

    public List<Item> getItems() {
        return items;
    }

}

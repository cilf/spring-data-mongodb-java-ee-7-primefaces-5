package cz.cilf.springdatamongodb;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {
    @Id
    private ObjectId id;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                '}';
    }
}

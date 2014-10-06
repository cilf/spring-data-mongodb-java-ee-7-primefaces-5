package cz.cilf.springdatamongodb;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ItemRepository extends MongoRepository<Item, ObjectId> {
}

package cz.cilf.springdatamongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ApplicationScoped;
import java.net.UnknownHostException;


@ApplicationScoped
public class MongoTemplateProducer {

    @Produces
    public MongoOperations createMongoTemplate() throws UnknownHostException, MongoException {

        MongoDbFactory factory = new SimpleMongoDbFactory(new MongoClient(), "dev");
        return new MongoTemplate(factory);
    }
}


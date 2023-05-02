package org.itson.mongopryect;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;

public class MongoPryect {

    public static void main(String[] args) {
        MongoClient mongoCliente = MongoClients.create();
        MongoDatabase db = mongoCliente.getDatabase("uber_eats");
        MongoCollection<Document> collection = db.getCollection("restaurantes");
        
        List<String> cat = new LinkedList<>();
        
        Document doc = new Document();
        doc.append("nombre", "Gibran's Sushi");
        doc.append("rating", 4.5);
        doc.append("categorias", cat);
        collection.insertOne(doc);
        
    }
}

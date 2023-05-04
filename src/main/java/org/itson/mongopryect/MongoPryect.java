package org.itson.mongopryect;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

public class MongoPryect {

    public static void main(String[] args) {
        
        MongoClient mongoCliente = MongoClients.create();
        MongoDatabase db = mongoCliente.getDatabase("uber_eats");
        MongoCollection<Document> collection = db.getCollection("restaurantes");

//        Document doc1 = new Document();
//        List<String> cat = new LinkedList<>();
//        cat.add("Sushi");
//        cat.add("Comida asiatica");
//
//        doc1.append("nombre", "Gibran's Sushi");
//        doc1.append("rating", 2);
//        doc1.append("categorias", cat);
//        collection.insertOne(doc1);
//
//        Document doc2 = new Document();
//        List<String> cat2 = new LinkedList<>();
//        cat2.add("Pizza");
//        cat2.add("Comida italiana");
//
//        doc2.append("nombre", "Domitsu's Pizza");
//        doc2.append("rating", 5);
//        doc2.append("categorias", cat2);
//        collection.insertOne(doc2);
//
//        Document doc3 = new Document();
//        List<String> cat3 = new LinkedList<>();
//        cat3.add("Tacos");
//        cat3.add("Comida mexicana");
//
//        doc3.append("nombre", "Jorge's Taqueria");
//        doc3.append("rating", 3);
//        doc3.append("categorias", cat3);
//        collection.insertOne(doc3);
        
        
//            Document doc = collection.find(eq("rating", 2))
//                    .first();
//            if (doc == null) {
//                System.out.println("No results found.");
//            } else {
//                System.out.println(doc.toJson());
//            }
//        
//     
//
//Document doc = collection.find(eq("categorias", "Pizza"))
//        .first();
//        
//     if (doc == null) {
//                System.out.println("No results found.");
//            } else {
//                System.out.println(doc.toJson());
//            }
    }
}

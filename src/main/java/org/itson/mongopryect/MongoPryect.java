package org.itson.mongopryect;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.regex;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

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
//        doc1.append("rating", 4);
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
//        Document filtro = new Document("rating", new Document("$gt", 4));
//
//        List<Document> resultados = new ArrayList<>();
//
//        try (MongoCursor<Document> cursor = collection.find(filtro).iterator()) {
//            while (cursor.hasNext()) {
//                resultados.add(cursor.next());
//            }
//        }
//
//        System.out.println("Se encontraron " + resultados.size() + " documentos:");
//        for (Document doc : resultados) {
//            System.out.println(doc.toJson());
//        }
//
//        Document filtro2 = new Document("categorias", new Document("$eq", "Pizza"));
//
//        List<Document> resultados2 = new ArrayList<>();
//
//        try (MongoCursor<Document> cursor = collection.find(filtro2).iterator()) {
//            while (cursor.hasNext()) {
//                resultados2.add(cursor.next());
//            }
//        }
//
//        System.out.println("Se encontraron " + resultados2.size() + " documentos:");
//        for (Document doc : resultados2) {
//            System.out.println(doc.toJson());
//        }
//
//        
//             List<Document> resultados3 = new ArrayList<>();
//        
//        // Crear la consulta
//        Document filtro3 = new Document("nombre", new Document("$regex",  ".*Sushi.*"));
//        
//        // Ejecutar la consulta y almacenar los resultados en la lista
//        try (MongoCursor<Document> cursor = collection.find(filtro3).iterator()) {
//            while (cursor.hasNext()) {
//                resultados3.add(cursor.next());
//            }
//           }
//        
//        // Hacer algo con los resultados
//        System.out.println("Se encontraron " + resultados3.size() + " documentos:");
//        for (Document doc : resultados3) {
//            System.out.println(doc.toJson());
//        }
//        
        // Actualizar el restaurante con el ID especificado
//        Document filtro6 = new Document("_id", new Document("$eq", new ObjectId("645409c65a94ec05f7fcd1c1")));
//
//        // Agregar la nueva categoría
//        Document update = new Document("$addToSet", new Document("categorias", "sushilito's food"));
//        collection.updateOne(filtro6, update);
        //  collection.deleteOne(Filters.eq("_id", new ObjectId("645409c65a94ec05f7fcd1c3")));
       collection.deleteMany(Filters.lte("rating", 3));
    }
}

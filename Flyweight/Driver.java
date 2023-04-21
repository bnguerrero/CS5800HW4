package CS5800HW4.Flyweight;

import java.util.ArrayList;

public class Driver
{
    static ArrayList<CharacterProperties> characterProps = new ArrayList<>();
    static CharacterPFactory characterFactory = new CharacterPFactory();
    public static void main(String[] args) 
    {
        // Create and edit documents with different character properties
        Document doc1 = new Document("HelloWorldCS5800");
        doc1.editDocumentProperties(characterFactory.getCharacterProperties("arial", "red", "12"));

        Document doc2 = new Document("HelloWorldCS5800");
        doc1.editDocumentProperties(characterFactory.getCharacterProperties("calibri", "blue", "14"));

        Document doc3 = new Document("HelloWorldCS5800");
        doc1.editDocumentProperties(characterFactory.getCharacterProperties("verdana", "black", "16"));
        

        System.out.println((doc1.loadDocument("doc1")).getDocumentProperties());
        System.out.println((doc2.loadDocument("doc1")).getDocumentProperties());
        System.out.println((doc3.loadDocument("doc1")).getDocumentProperties());

    }
}

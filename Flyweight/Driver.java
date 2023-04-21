package CS5800HW4.Flyweight;

import java.util.ArrayList;

public class Driver implements Runnable
{
    static ArrayList<CharacterProperties> characterProps = new ArrayList<>();
    static CharacterPFactory characterFactory = new CharacterPFactory();
    public static void main(String[] args) 
    {
         Runnable createDocument = new Runnable()
         {
            @Override
            public void run() 
            {
                createDocument();
            }

         }





    
         private static void createDocument() 
         {
            CharacterProperties characterProps1 = characterPropertiesFactory.getCharacterProperties("Arial", "Red", 12);
            

         }



           // Create and edit documents with different character properties
        Document doc1 = new Document("HelloWorldCS5800");
        doc1.setCharacterProperties(characterPropertiesFactory.getCharacterProperties("Arial", "Red", 12));
        doc1.saveToFile("doc1.txt");
    }
}

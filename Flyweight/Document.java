package CS5800HW4.Flyweight;

public class Document 
{
    private String documentName;
    private CharacterProperties characterProperties;


    public Document(String documentName) {
        this.documentName = documentName;

    }

    public void editDocumentProperties(CharacterProperties characterProperties)
    {
        this.characterProperties = characterProperties;
    }

    public CharacterProperties getDocumentProperties()
    {
        return characterProperties;
    }

    public Document loadDocument(String documentName)
    {
        return new Document(this.documentName); ///!!!!!
    }

    public void saveDocument()
    {
        System.out.println("saving document");
    }
}

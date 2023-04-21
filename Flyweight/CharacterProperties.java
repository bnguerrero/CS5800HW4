package CS5800HW4.Flyweight;

public class CharacterProperties implements CharacterPInterface
{
    private String font;
    private String color;
    private String size;

    public CharacterProperties(String font, String color, String size)
    {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public void setFont(String font)
    {
        this.font = font;
    }

    public String getFont()
    {
        return font;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getSize()
    {
        return size;
    }
}

package CS5800HW4.Flyweight;

import java.util.HashMap;

public class CharacterPFactory 
{
    private HashMap<String, CharacterProperties> characterProps = new HashMap<>();

    public CharacterProperties getCharacterProperties(String font, String color, String size)
    {
        String props = font + color + size;

        if(characterProps.containsKey(props))
        {
            return characterProps.get(props);
        }
        else
        {
            CharacterProperties characterProperties = new CharacterProperties(font, color, size);

            characterProps.put(props, characterProperties);
            return characterProperties;
        }
    }
}

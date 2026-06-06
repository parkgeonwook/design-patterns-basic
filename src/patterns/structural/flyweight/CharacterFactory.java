package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<Character, CharacterFlyWeight> pool = new HashMap<>();

    public CharacterFlyWeight getCharacter(char key) {
        if (!pool.containsKey(key)) {
            pool.put(key, new CharacterFlyWeight(key));
        }

        return pool.get(key);
    }

}

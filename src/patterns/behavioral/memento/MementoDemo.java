package patterns.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        GameCharacter character = new GameCharacter(1);

        GameMemento save = character.save();

        character.levelUp();
        character.levelUp();

        character.restore(save);
    }
}

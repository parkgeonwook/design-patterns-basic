package patterns.behavioral.memento;

public class GameMemento {
    private int level;

    public GameMemento(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

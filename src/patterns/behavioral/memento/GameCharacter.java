package patterns.behavioral.memento;

public class GameCharacter {
    private int level;

    public GameCharacter(int level) {
        this.level = level;
    }

    public void levelUp() {
        level++;
        System.out.println("레벨이 " + level + "이(가) 되었습니다.");
    }

    public GameMemento save() {
        return new GameMemento(level);
    }

    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        System.out.println("레벨이 " + level + "(으)로 복원되었습니다.");
    }
}

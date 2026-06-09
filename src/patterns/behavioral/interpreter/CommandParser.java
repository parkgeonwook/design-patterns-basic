package patterns.behavioral.interpreter;

public class CommandParser {
    public Expression parse(String command) {
        String[] parts = command.split(" ");

        if (parts[0].equals("MOVE")) {
            int distance = Integer.parseInt(parts[1]);
            return new MoveExpression(distance);
        }

        if (parts[0].equals("TURN")) {
            return new TurnExpression(parts[1]);
        }

        throw new IllegalArgumentException("알 수 없는 명령어입니다: " + command);
    }
}

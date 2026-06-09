package patterns.behavioral.interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {
        CommandParser parser = new CommandParser();

        Expression move = parser.parse("MOVE 3");
        Expression turn = parser.parse("TURN LEFT");

        move.interpret();
        turn.interpret();
    }
}

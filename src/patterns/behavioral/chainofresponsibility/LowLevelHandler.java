package patterns.behavioral.chainofresponsibility;

public class LowLevelHandler extends Handler {

    @Override
    protected boolean canHandle(int request) {
        return request <= 10;
    }

    @Override
    protected void process(int request) {
        System.out.println("LowLevelHandler가 처리했습니다: " + request);
    }
}

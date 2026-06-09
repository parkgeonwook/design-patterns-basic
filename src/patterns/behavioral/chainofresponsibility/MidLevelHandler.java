package patterns.behavioral.chainofresponsibility;

public class MidLevelHandler extends Handler {

    @Override
    protected boolean canHandle(int request) {
        return request <= 20;
    }

    @Override
    protected void process(int request) {
        System.out.println("MidLevelHandler가 처리했습니다: " + request);
    }
}

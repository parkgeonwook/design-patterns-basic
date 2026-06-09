package patterns.behavioral.chainofresponsibility;

public class HighLevelHandler extends Handler {

    @Override
    protected boolean canHandle(int request) {
        return request <= 30;
    }

    @Override
    protected void process(int request) {
        System.out.println("HighLevelHandler가 처리했습니다: " + request);
    }
}

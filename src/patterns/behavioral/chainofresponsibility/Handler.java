package patterns.behavioral.chainofresponsibility;

public abstract class Handler {
    protected Handler next;

    public void setHandler(Handler next) {
        this.next = next;
    }

    public void handle(int request) {
        if (canHandle(request)) {
            process(request);
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("처리할 수 없습니다: " + request);
        }
    }

    protected abstract boolean canHandle(int request);

    protected abstract void process(int request);
}

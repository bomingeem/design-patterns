package designpatterns.chainofresponsibility.step1;

public class RequestHandler {
    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}

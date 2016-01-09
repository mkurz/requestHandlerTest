import play.http.HttpRequestHandler;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.lang.reflect.Method;

import java.util.concurrent.CompletionStage;

public class RequestHandler implements HttpRequestHandler {

    @Override
    public Action createAction(Http.Request request, Method actionMethod) {
        return new Action.Simple() {
            @Override
            public CompletionStage<Result> call(Http.Context ctx) {
                System.out.println("In custom requesthandler");
                return delegate.call(ctx);
            }
        };
    }

    @Override
    public Action wrapAction(Action action) {
        return action;
    }
}

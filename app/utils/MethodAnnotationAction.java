package utils;

import play.libs.F.Promise;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

public class MethodAnnotationAction extends Action<MethodAnnotation> {
	
	@Override
	public Promise<Result> call(final Context ctx) throws Throwable {
        System.out.println("In MethodAnnotation");
		return this.delegate.call(ctx);
	}

}

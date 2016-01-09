package utils;

import play.libs.F.Promise;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

public class ClassAnnotationAction extends Action<ClassAnnotation> {
	
	@Override
	public Promise<Result> call(final Context ctx) throws Throwable {
		return this.delegate.call(ctx);
	}

}

package utils;

import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

public class ClassAnnotationAction extends Action<ClassAnnotation> {
	
	@Override
	public CompletionStage<Result> call(final Context ctx) {
        System.out.println("In ClassAnnotation");
		return this.delegate.call(ctx);
	}

}

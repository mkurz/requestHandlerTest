package controllers;

import play.*;
import play.mvc.*;

import utils.ClassAnnotation;
import utils.MethodAnnotation;

import views.html.*;

@ClassAnnotation
public class Application extends Controller {

    @MethodAnnotation
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

}

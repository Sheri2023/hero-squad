package com.igacheri.utils;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.Map;
public class sharedutils {
    public static String render(Map<Integer, Object> model, String templateName) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templateName));
    }
}
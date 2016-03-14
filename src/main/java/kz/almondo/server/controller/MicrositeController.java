package kz.almondo.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by User on 14.03.2016.
 */
@Controller
@RequestMapping("/microsite")
public class MicrositeController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getMicrosite(ModelMap model) {
        return "You successfully get microsite!";
    }
}

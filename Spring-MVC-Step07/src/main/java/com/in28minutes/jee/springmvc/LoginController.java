package com.in28minutes.jee.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    // @ResponseBody responseBody solo funciona si queremos que el texto se muestre literalmente
    // para mostrar una vista solo debemos colocar el nombre de la vista
    public String showLogginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginRequest(@RequestParam String name,
                                     @RequestParam String password,
                                     ModelMap model) {
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
}

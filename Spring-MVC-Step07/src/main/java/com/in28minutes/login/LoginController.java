package com.in28minutes.login;

import com.in28minutes.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Set the login service here
    @Autowired
    LoginService loginService = new LoginService();

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
        if (loginService.validateUser(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials");
        return "login";

    }
}

package com.in28minutes.jee.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value="/login")
    // @ResponseBody responseBody solo funciona si queremos que el texto se muestre literalmente
    // para mostrar una vista solo debemos colocar el nombre de la vista
    public String sayHello() {
        return "login";
    }
}

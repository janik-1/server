package fr.efrei.server.web.rest; //le nom dépend de votre nom de domaine

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ItemResource {
    @GetMapping("/items")
    public String test(){
        return "Hello World !";
    }
}
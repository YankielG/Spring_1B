package Zjazd2.wszib.controller;


import Zjazd2.wszib.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequestMapping("/body")
@RestController
public class BodyController {

    @PostMapping(path = "/odwroc",consumes = "tex/plain")
    public String odwroc(@RequestBody String string){
        char[] znaki = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = znaki.length-1; i >=0; --i){
            sb.append(znaki[i]);
            }
        return sb.toString();

    }

    @PostMapping(path= "/tablice", consumes = "application/json")
    public String tablice2(@RequestBody String[] strs){
        return Stream.of(strs)
                .map(String::toUpperCase)
                .collect(Collectors.joining(";"));
    }

    @PostMapping(path = "/uprosc", consumes = "application/json")
    public String uprosc(@RequestBody User user){
        return user.getName() + " " + user.getNazwisko() + " " + user.getWiek();
    }


}

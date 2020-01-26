package Zjazd2.wszib.controller;

import org.springframework.web.bind.annotation.*;


@RequestMapping("/header")
@RestController
public class HeaderController {


    @GetMapping("/dodaj")
    public int dodaj(@RequestHeader("header_a") int a,
                     @RequestHeader("header_b") int b){

        return a+b;
    }

    @GetMapping("/odejmowani")
    public int odejmowanie(@RequestHeader("header_a") int a,
                     @RequestHeader("header_b") int b){

        return a-b;
    }

    @GetMapping("/mnozenie")
    public int mnozenie(@RequestHeader("header_a") int a,
                     @RequestHeader("header_b") int b){

        return a*b;
    }

    @GetMapping("/dzielenie")
    public int dzielenie(@RequestHeader("header_a") int a,
                     @RequestHeader("header_b") int b){

        return a/b;
    }

    @GetMapping("/tablice")
    public String tablice(String[] strs){
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < strs.length; ++i){
            sb.append((strs[i]));
            if(i != strs.length-1){
                sb.append(";");
            }
        }
        return sb.toString();
    }


}

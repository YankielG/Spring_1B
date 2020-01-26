package Zjazd2.wszib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/param")
@RestController
public class ParmController {

    @GetMapping("/dodaj")
    public int dodaj(@RequestParam(name ="pierwsza", required = false) Integer a,
                     @RequestParam(name = "druga", required = false) Integer b){
       if(a == null){
           a=0;
       }
       if (b == 0){
           b=0;
       }
        return a+b;
    }

    @GetMapping("odejmij")
    public int odejmij(@RequestParam("pierwsza") int a, @RequestParam("druga") int b){
        return a-b;
    }

    @GetMapping("mnozenie")
    public int mnozenie(@RequestParam("pierwsza") int a, @RequestParam("druga") int b){
        return a*b;
    }

    @GetMapping("dzielenie")
    public int dzielenie(@RequestParam("pierwsza") int a, @RequestParam("druga") int b){
        return a-b;
    }
    @GetMapping("dzielenie2")
    public int dzielenie2(@RequestParam(name ="pierwsza", required = false) Integer a,
                     @RequestParam(name = "druga", required = false) Integer b){
        if(a == null){
            a=0;
        }
        if (b == 0){
            b=1;
        }
        return a/b;
    }

}

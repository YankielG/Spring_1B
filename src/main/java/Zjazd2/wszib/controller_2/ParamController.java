package Zjazd2.wszib.controller_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.Stream;


//NIE przesyłać azwykłaych danych w HEADERACH

@RequestMapping("/param")
@RestController
public class ParamController {

    @GetMapping("dodaj")
    public int dodaj(@RequestParam("pierwsza") int a,
                     @RequestParam("druga") int b){
        return a + b;
    }

    @GetMapping("odejmij")
    public int odejmij( @RequestParam("trzecia") int a,
                        @RequestParam("czwarta") int b){
        return a - b;
    }

    @GetMapping("mnozenie")
    public int mnozenie(@RequestParam("skladnik1") int a,
                        @RequestParam("skladnik2") int b){
        return a * b;
    }

    @GetMapping("dzielenie")
    public int dzielenie(@RequestParam("pierwsza") int a, @RequestParam("druga") int b){
        return a-b;
    }

    @GetMapping("dzielenie_2")        //przypadek gdy parametryu nie sa wymagane
    public int dzielenie(@RequestParam(required = false, name = "dzielna") Integer a,
                         @RequestParam(required = false, name = "dzielnik") Integer b){
        if(a == null){              //musimy obslużyć że wartosci będą nullami
            a = 0;
        }
        if(b == null){
            b = 1;
        }
        return a / b;
    }

    @GetMapping("/tablice")
    public String tablice(@RequestParam String[] strs){     //przesyłanie tablic w url
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strs.length; i++){
            sb.append(strs[i]);
            if(i != strs.length -1){
                sb.append(";");
            }
        }
        return sb.toString();
    }

    @GetMapping("/tablice2")
    public String tablice2(@RequestParam String[] strs){
        return Stream.of(strs)
                .map(String::toUpperCase)
                .collect(Collectors.joining(";"));
    }

}
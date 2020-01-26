package Zjazd2.wszib.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Calendar;


@RequestMapping("/test")
@RestController
public class PierwszyController {

    @GetMapping("/dodaj/{a}/{b}")
    public int dodaj(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
    @GetMapping("/odejmowanie/{a}/{b}")
    public int odejmowanie(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }

    @GetMapping("/mnozenie/{a}/{b}" )
    public int mnozenie (@PathVariable int a, @PathVariable int b){
        return a * b;
    }

    @GetMapping("/dzielenie/{a}/{b}" )
    public int dzielenie (@PathVariable int a, @PathVariable int b){
        return a / b;
    }

@GetMapping("/dzienTygodnia/{rok}/{miesiac}/{dzien}")
    public int dzienTygodnia(
            @PathVariable int dzien,
            @PathVariable @Min(1) @Max(12) int miesiac,
            @PathVariable int rok) {

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, rok);
    calendar.set(Calendar.MONTH, miesiac-1);
    calendar.set(Calendar.DAY_OF_MONTH, dzien);
    return calendar.get(Calendar.DAY_OF_WEEK) -1;


    }


    @GetMapping
    public String helloworld() {
        return "hello word";
    }

    @PostMapping
    public String helloworld2() {
        return "hello word2";
    }


}

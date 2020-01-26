package Zjazd2.wszib.controller;

import Zjazd2.wszib.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

@RequestMapping("/mieszany")
@RestController
public class MieszanyController {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class NotFoundException extends RuntimeException {
    }

    private User user;

    @PostMapping
    public User stworz(@RequestParam String imie,
                       @RequestParam String nazwisko,
                       @RequestParam int wiek) {
        user = new User(imie, nazwisko, wiek);
        return user;
    }

    @PatchMapping("dodaj/{uprawnienia}")
    public User dodaj(@PathVariable String uprawnienia) {

        if (user == null) {
            throw new NotFoundException();
        }
        user.addUprawnienie(uprawnienia);
        return user;
    }

    @PatchMapping("usun/{uprawnienia}")
    public User usun(@PathVariable String uprawnienia) {

        if (user == null) {
            throw new NotFoundException();
        }
        user.removeUprawnienie(uprawnienia);
        return user;
    }

    @DeleteMapping
    public  void usun(){
        user = null;
    }

    @GetMapping
    public  User dostan(){
        return user;
    }


}




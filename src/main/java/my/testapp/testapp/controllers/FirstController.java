package my.testapp.testapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String runApp() {
        return "Приложение запущено";
    }
@GetMapping("/info/")
    public String infoType() {
        return "Name. Project. Date. Description";
    }

}

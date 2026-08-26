package dev.ninjasdatabse.NinjasDatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome(){
        return"Welcome to NinjasDatabase";
    }
}

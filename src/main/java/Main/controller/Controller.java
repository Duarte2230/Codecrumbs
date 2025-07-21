package Main.controller;

import Main.classes.ValidParentheses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class Controller {

    @GetMapping("/isValid")
    public boolean isValid(@RequestParam String input) {
        final ValidParentheses validator = new ValidParentheses();
        return validator.isValid(input);
    }
}

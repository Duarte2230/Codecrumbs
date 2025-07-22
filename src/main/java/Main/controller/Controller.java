package Main.controller;

import Main.classes.ValidParentheses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://codecrumbs22.netlify.app")
public class Controller {

    // GET está OK para pequenas queries
    @GetMapping("/isValid")
    public boolean isValid(@RequestParam String input) {
        ValidParentheses validator = new ValidParentheses();
        return validator.isValid(input);
    }
}

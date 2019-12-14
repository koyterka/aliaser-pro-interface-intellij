package Application.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

    @GetMapping(value="/add")
    public String createRecipe() {
        System.out.println("new recipe button clicked");
        return "NewRecipe";
    }

    @PostMapping(value = "/done")
    public String recipeDone(@RequestParam(value = "name", required = true) String name,
                             @RequestParam(value = "recipe", required = true) String recipe,
                             @RequestParam(value ="vege",defaultValue = "false")Boolean isVege) {
        System.out.println(name + " "+ recipe+" "+isVege);
        return "SuccessPage";
    }
}
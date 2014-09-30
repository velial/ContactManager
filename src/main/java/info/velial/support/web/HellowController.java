package info.velial.support.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Igor on 17.03.14.
 */
@Controller
public class HellowController {

    @RequestMapping("/")
    public String homeRerirect()
    {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String home()
    {
        return "home";
    }
}

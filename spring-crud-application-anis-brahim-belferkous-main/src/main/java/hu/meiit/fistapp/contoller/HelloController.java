package hu.meiit.fistapp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //for enumerating methods


public class HelloController {

    @RequestMapping(path = "/main",method = RequestMethod.GET)   //mapping from
    @ResponseBody
    public String main() {
       return "Hello spring First app";
    }

}
